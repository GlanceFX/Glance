package com.glance.bukkit.api.utils;

import org.bukkit.Color;

public final class ColorUtils {

    private ColorUtils(){}

    public static Color getBukkitColor(com.glance.glance.api.model.properties.Color color) {
        // todo
        return Color.WHITE;
    }

    public static com.glance.glance.api.model.properties.Color fromBukkitColor(Color color) {
        // todo
        return com.glance.glance.api.model.properties.Color.white();
    }

}
