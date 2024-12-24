package com.glance.bukkit.runtime.nms;

import com.glance.common.ReflectionUtil;
import com.glance.common.exception.ReflectionException;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.entity.Display;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class Accessors {

    /* Shared Accessors */

    public static final int FLAG_INVISIBLE = 1 << 5;
    public static final int FLAG_GLOWING = 1 << 6;

    public static EntityDataAccessor<Byte> SHARED_FLAGS;

    // Transformation
    public static final EntityDataAccessor<Vector3f> TRANSLATION;
    public static final EntityDataAccessor<Vector3f> SCALE;
    public static final EntityDataAccessor<Quaternionf> LEFT_ROTATION;
    public static final EntityDataAccessor<Quaternionf> RIGHT_ROTATION;

    // Rendering
    public static final EntityDataAccessor<Float> VIEW_RANGE;
    public static final EntityDataAccessor<Float> SHADOW_RADIUS;
    public static final EntityDataAccessor<Float> SHADOW_STRENGTH;
    public static final EntityDataAccessor<Integer> GLOW_COLOR;
    public static final EntityDataAccessor<Byte> BILLBOARD;
    public static final EntityDataAccessor<Integer> BRIGHTNESS;
    public static final EntityDataAccessor<Float> CULLING_WIDTH;
    public static final EntityDataAccessor<Float> CULLING_HEIGHT;

    // Animation
    public static final EntityDataAccessor<Integer> INTERPOLATION_DELAY;
    public static final EntityDataAccessor<Integer> INTERPOLATION_DURATION;
    public static final EntityDataAccessor<Integer> TELEPORT_DURATION;

    /* Item Display Accessors */

    public static final EntityDataAccessor<ItemStack> ITEM_STACK;
    public static final EntityDataAccessor<Byte> ITEM_VIEW;

    /* Block Display Accessors */

    public static final EntityDataAccessor<BlockState> BLOCK_STATE;

    /* Text Display Accessors */

    public static final int FLAG_TEXT_SHADOW = 1;
    public static final int FLAG_TEXT_TRANSPARENT = 1 << 1;
    public static final int FLAG_TEXT_DEFAULT_BACKGROUND = 1 << 2;
    public static final int FLAG_TEXT_ALIGN_LEFT= 1 << 3;
    public static final int FLAG_TEXT_ALIGN_RIGHT = 1 << 4;

    public static final EntityDataAccessor<Component> TEXT;
    public static final EntityDataAccessor<Integer> LINE_WIDTH;
    public static final EntityDataAccessor<Integer> BACKGROUND_COLOR;
    public static final EntityDataAccessor<Byte> TEXT_OPACITY;
    public static final EntityDataAccessor<Byte> STYLE_FLAGS;

    static {
        try {
            // Shared
            SHARED_FLAGS = ReflectionUtil.getStaticFieldValue(Entity.class, "DATA_SHARED_FLAGS_ID");

            TRANSLATION = getDisplayAccessor("DATA_TRANSLATION_ID");
            SCALE = ReflectionUtil.getStaticFieldValue(Display.class, "DATA_SCALE_ID");
            LEFT_ROTATION = ReflectionUtil.getStaticFieldValue(Display.class, "DATA_LEFT_ROTATION_ID");
            RIGHT_ROTATION = ReflectionUtil.getStaticFieldValue(Display.class, "DATA_RIGHT_ROTATION_ID");

            VIEW_RANGE = getDisplayAccessor("DATA_VIEW_RANGE_ID");
            SHADOW_RADIUS = getDisplayAccessor("DATA_SHADOW_RADIUS_ID");
            SHADOW_STRENGTH = getDisplayAccessor("DATA_SHADOW_STRENGTH_ID");
            GLOW_COLOR = getDisplayAccessor("DATA_GLOW_COLOR_OVERRIDE_ID");
            BILLBOARD = getDisplayAccessor("DATA_BILLBOARD_RENDER_CONSTRAINTS_ID");
            BRIGHTNESS = getDisplayAccessor("DATA_BRIGHTNESS_ID");
            CULLING_WIDTH = getDisplayAccessor("DATA_WIDTH_ID");
            CULLING_HEIGHT = getDisplayAccessor("DATA_HEIGHT_ID");

            INTERPOLATION_DELAY = getDisplayAccessor("DATA_TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS_ID");
            INTERPOLATION_DURATION = getDisplayAccessor("DATA_TRANSFORMATION_INTERPOLATION_DURATION_ID");
            TELEPORT_DURATION = getDisplayAccessor("DATA_POS_ROT_INTERPOLATION_DURATION_ID");

            // Item Display
            ITEM_STACK = getItemAccessor("DATA_ITEM_STACK_ID");
            ITEM_VIEW = getItemAccessor("DATA_ITEM_DISPLAY_ID");

            // Block Display
            BLOCK_STATE = getBlockAccessor("DATA_BLOCK_STATE_ID");

            // Text Display
            TEXT = getTextAccessor("DATA_TEXT_ID");
            LINE_WIDTH = getTextAccessor("DATA_LINE_WIDTH_ID");
            BACKGROUND_COLOR = getTextAccessor("DATA_BACKGROUND_COLOR_ID");
            TEXT_OPACITY = getTextAccessor("DATA_TEXT_OPACITY_ID");
            STYLE_FLAGS = getTextAccessor("DATA_STYLE_FLAGS_ID");
        } catch (Exception e) {
            throw new ReflectionException("Failed to initialized data accessors", e);
        }
    }

    private static <T> EntityDataAccessor<T> getDisplayAccessor(String name) {
        return ReflectionUtil.getStaticFieldValue(Display.class, name);
    }

    private static <T> EntityDataAccessor<T> getBlockAccessor(String name) {
        return ReflectionUtil.getStaticFieldValue(Display.BlockDisplay.class, name);
    }

    private static <T> EntityDataAccessor<T> getItemAccessor(String name) {
        return ReflectionUtil.getStaticFieldValue(Display.ItemDisplay.class, name);
    }

    private static <T> EntityDataAccessor<T> getTextAccessor(String name) {
        return ReflectionUtil.getStaticFieldValue(Display.TextDisplay.class, name);
    }

}
