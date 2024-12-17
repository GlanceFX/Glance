package com.parakeetstudios.apparition.api.utils;

/**
 * Represents custom light values used for rendering, overriding the default light values
 * derived from the model's position.
 * <p>
 * If omitted, rendering will use the default light levels based on the model's position.
 *
 * @param blockLight The block light level, ranging from 0 to 15 (inclusive).
 * @param skyLight   The skylight level, ranging from 0 to 15 (inclusive).
 */
public record Brightness(int blockLight, int skyLight) {
    public Brightness {
        Validation.checkArgRange(blockLight, 0, 15, "blockLight");
        Validation.checkArgRange(skyLight, 0, 15, "skyLight");
    }
    static Brightness FULL_BRIGHT = new Brightness(15, 15);
    static Brightness SHADOW = new Brightness(0, 0);
}
