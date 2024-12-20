package com.glance.glance.api.model;

import com.glance.glance.api.model.properties.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.function.Consumer;

/**
 * Represents a model entity with configurable rendering, interpolation, transformation, and lifecycle behavior.
 * Provides a fluent API for setting various properties.
 */
public interface Model {

    /* Entity Data */

    /**
     * Gets the unique identifier of the model entity.
     *
     * @return The unique ID of the entity.
     */
    @NotNull
    UUID getUniqueId();

    /**
     * Gets the entity's ID.
     *
     * @return The entity ID.
     */
    int getEntityId();

    /* Render Settings */

    /**
     * Gets the view range of the model.
     *
     * @return The view range.
     */
    float getViewRange();
    /**
     * Sets the view range of the model.
     *
     * @param viewRange The new view range.
     */
    void setViewRange(float viewRange);
    /**
     * Sets the view range and returns the model for chaining.
     *
     * @param viewRange The new view range.
     * @return This model.
     */
    default Model viewRange(float viewRange) {
        setViewRange(viewRange);
        return this;
    }

    /**
     * Gets the shadow settings of the model.
     *
     * @return The shadow settings.
     */
    @NotNull
    Shadow getShadow();
    /**
     * Sets the shadow settings of the model.
     *
     * @param shadow The new shadow settings.
     */
    void setShadow(@NotNull Shadow shadow);
    /**
     * Sets the shadow settings and returns the model for chaining.
     *
     * @param shadow The new shadow settings.
     * @return This model.
     */
    default Model shadow(@NotNull Shadow shadow) {
        setShadow(shadow);
        return this;
    }
    /**
     * Sets the shadow settings using radius and strength.
     *
     * @param radius   The shadow radius.
     * @param strength The shadow strength.
     */
    default void setShadow(float radius, float strength) {
        setShadow(new Shadow(radius, strength));
    }
    /**
     * Sets the shadow settings using radius and strength and returns the model for chaining.
     *
     * @param radius   The shadow radius.
     * @param strength The shadow strength.
     * @return This model.
     */
    default Model shadow(float radius, float strength) {
        setShadow(radius, strength);
        return this;
    }
    /**
     * Gets the shadow radius.
     *
     * @return The shadow radius.
     */
    float getShadowRadius();
    /**
     * Sets the shadow radius.
     *
     * @param radius The shadow radius.
     */
    void setShadowRadius(float radius);
    /**
     * Sets the shadow radius and returns the model for chaining.
     *
     * @param radius The shadow radius.
     * @return This model.
     */
    default Model shadowRadius(float radius) {
        setShadowRadius(radius);
        return this;
    }
    /**
     * Gets the shadow strength.
     *
     * @return The shadow strength.
     */
    float getShadowStrength();
    /**
     * Sets the shadow strength.
     *
     * @param strength The shadow strength.
     */
    void setShadowStrength(float strength);
    /**
     * Sets the shadow strength and returns the model for chaining.
     *
     * @param strength The shadow strength.
     * @return This model.
     */
    default Model shadowStrength(float strength) {
        setShadowRadius(strength);
        return this;
    }

    /**
     * Gets the culling/view scale settings of the model.
     *
     * @return The culling settings.
     */
    @NotNull
    Culling getCulling();
    /**
     * Sets the culling/view scale settings of the model.
     *
     * @param culling The new culling settings.
     */
    void setCulling(@NotNull Culling culling);
    /**
     * Sets the culling settings and returns the model for chaining.
     *
     * @param culling The new culling settings.
     * @return This model.
     */
    default Model culling(@NotNull Culling culling) {
        setCulling(culling);
        return this;
    }

    /**
     * Gets the culling width.
     *
     * @return The culling width.
     */
    float getCullingWidth();
    /**
     * Sets the culling width.
     *
     * @param width The culling width.
     */
    void setCullingWidth(float width);
    /**
     * Sets the culling width and returns the model for chaining.
     *
     * @param width The culling width.
     * @return This model.
     */
    default Model cullingWidth(float width) {
        setCullingWidth(width);
        return this;
    }

    /**
     * Gets the culling height.
     *
     * @return The culling height.
     */
    float getCullingHeight();
    /**
     * Sets the culling height.
     *
     * @param height The culling height.
     */
    void setCullingHeight(float height);
    /**
     * Sets the culling height and returns the model for chaining.
     *
     * @param height The culling height.
     * @return This model.
     */
    default Model cullingHeight(float height) {
        setCullingHeight(height);
        return this;
    }

    /**
     * Gets the billboard settings of the model.
     *
     * @return The billboard settings.
     */
    @NotNull
    Billboard getBillboard();
    /**
     * Sets the billboard settings of the model.
     *
     * @param billboard The new billboard settings.
     */
    void setBillboard(@NotNull Billboard billboard);

    /**
     * Gets the brightness settings of the model.
     *
     * @return The brightness settings.
     */
    @NotNull
    Brightness getBrightness();
    /**
     * Sets the brightness settings of the model.
     *
     * @param brightness The new brightness settings.
     */
    void setBrightness(@NotNull Brightness brightness);
    /**
     * Sets the brightness settings using block light and skylight values.
     *
     * @param blockLight The block light value.
     * @param skyLight   The skylight value.
     */
    default void setBrightness(int blockLight, int skyLight) {
        setBrightness(new Brightness(blockLight, skyLight));
    }
    /**
     * Gets the block light level.
     *
     * @return The block light level.
     */
    int getBlockLight();
    /**
     * Sets the block light level.
     *
     * @param blockLight The block light level.
     */
    void setBlockLight(int blockLight);
    /**
     * Sets the block light level and returns the model for chaining.
     *
     * @param blockLight The block light level.
     * @return This model.
     */
    default Model blockLight(int blockLight) {
        setBlockLight(blockLight);
        return this;
    }
    /**
     * Gets the skylight level.
     *
     * @return The skylight level.
     */
    int getSkyLight();
    /**
     * Sets the skylight level.
     *
     * @param skyLight The skylight level.
     */
    void setSkyLight(int skyLight);
    /**
     * Sets the skylight level and returns the model for chaining.
     *
     * @param skyLight The skylight level.
     * @return This model.
     */
    default Model skyLight(int skyLight) {
        setBlockLight(skyLight);
        return this;
    }

    /**
     * Gets the glow color of the model.
     *
     * @return The glow color.
     */
    @NotNull
    Color getGlowColor();
    /**
     * Sets the glow color of the model.
     *
     * @param color The new glow color.
     */
    void setGlowWithColor(@NotNull Color color);
    /**
     * Sets the glow color and returns the model for chaining.
     *
     * @param color The new glow color.
     * @return This model.
     */
    default Model glowWithColor(@NotNull Color color) {
        setGlowWithColor(color);
        return this;
    }

    /* Interpolation */

    /**
     * Gets the interpolation settings of the model.
     *
     * @return The interpolation settings.
     */
    @NotNull
    Interpolation getInterpolation();
    /**
     * Sets the interpolation settings of the model.
     *
     * @param interpolation The new interpolation settings.
     */
    void setInterpolation(@NotNull Interpolation interpolation);
    /**
     * Sets the interpolation settings and returns the model for chaining.
     *
     * @param interpolation The new interpolation settings.
     * @return This model.
     */
    default Model interpolation(@NotNull Interpolation interpolation) {
        setInterpolation(interpolation);
        return this;
    }
    /**
     * Gets the interpolation delay.
     *
     * @return The interpolation delay in ticks.
     */
    int getInterpolationDelay();
    /**
     * Sets the interpolation delay.
     *
     * @param interpolationDelay The interpolation delay in ticks.
     */
    void setInterpolationDelay(int interpolationDelay);
    /**
     * Sets the interpolation delay and returns the model for chaining.
     *
     * @param delay The interpolation delay in ticks.
     * @return This model.
     */
    default Model interpolateAfter(int delay) {
        setInterpolationDelay(delay);
        return this;
    }
    /**
     * Gets the interpolation duration.
     *
     * @return The interpolation duration in ticks.
     */
    int getInterpolationDuration();
    /**
     * Sets the interpolation duration.
     *
     * @param interpolationDuration The interpolation duration in ticks.
     */
    void setInterpolationDuration(int interpolationDuration);
    /**
     * Sets the interpolation duration and returns the model for chaining.
     *
     * @param duration The interpolation duration in ticks.
     * @return This model.
     */
    default Model interpolateOver(int duration) {
        setInterpolationDuration(duration);
        return this;
    }
    /**
     * Gets the teleport interpolation duration.
     *
     * @return The teleport interpolation duration in ticks.
     */
    int getTeleportDuration();
    /**
     * Sets the teleport interpolation duration.
     *
     * @param teleportDuration The teleport interpolation duration in ticks.
     */
    void setTeleportDuration(int teleportDuration);
    /**
     * Sets the teleport interpolation duration and returns the model for chaining.
     *
     * @param duration The teleport interpolation duration in ticks.
     * @return This model.
     */
    default Model teleportOver(int duration) {
        setTeleportDuration(duration);
        return this;
    }

    /* Transform Matrix */

    /**
     * Gets the transformation matrix of the model.
     *
     * @return The transformation matrix.
     */
    @NotNull
    Transform getTransformation();
    /**
     * Sets the transformation matrix of the model.
     *
     * @param transform The new transformation matrix.
     */
    void setTransform(@NotNull Transform transform);
    /**
     * Sets the transformation matrix and returns the model for chaining.
     *
     * @param transform The new transformation matrix.
     * @return This model.
     */
    default Model transform(@NotNull Transform transform) {
        setTransform(transform);
        return this;
    }

    /**
     * Edits the transformation matrix using a custom editor function.
     *
     * @param editor A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default Model editTransform(Consumer<Transform> editor) {
        Transform t = getTransformation();
        editor.accept(t);
        setTransform(t);
        return this;
    }

    /**
     * Applies an immediate interpolation to the transformation matrix using a custom editor function.
     *
     * @param editor A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default Model interpolateTransform(Consumer<Transform> editor) {
        Transform t = getTransformation();
        editor.accept(t);
        setTransform(t);
        this.setInterpolationDelay(0);
        this.setInterpolationDuration(1);
        return this;
    }

    /**
     * Applies an interpolation to the transformation matrix over a specified duration.
     *
     * @param duration The interpolation duration in ticks.
     * @param editor   A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default Model interpolateTransform(int duration, Consumer<Transform> editor) {
        Transform t = getTransformation();
        editor.accept(t);
        setTransform(t);
        this.setInterpolationDelay(0);
        this.setInterpolationDuration(duration);
        return this;
    }

    /**
     * Applies an interpolation to the transformation matrix with a specified delay and duration.
     *
     * @param delay    The interpolation delay in ticks.
     * @param duration The interpolation duration in ticks.
     * @param editor   A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default Model interpolateTransform(int delay, int duration, Consumer<Transform> editor) {
        Transform t = getTransformation();
        editor.accept(t);
        setTransform(t);
        this.setInterpolationDelay(delay);
        this.setInterpolationDuration(duration);
        return this;
    }

    /* LifeCycle */

    /**
     * Updates the model.
     */
    void update();

    /**
     * Spawns the model for a specified viewer.
     *
     * @param viewer The viewer for whom the model is spawned.
     */
    void spawn(Object viewer);

    /**
     * Removes the model from the world.
     */
    void remove();

}
