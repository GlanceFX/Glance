package com.glance.glance.api.model.properties;

import com.glance.glance.api.utils.Validation;

/**
 * Represents interpolation settings for a model, defining how smooth transitions occur.
 * <p>
 * This includes general interpolation duration, teleport-specific interpolation duration,
 * and an optional delay before interpolation begins.
 *
 * @param delay     The delay in ticks before interpolation starts. If set to 0, interpolation starts immediately.
 * @param duration  The interpolation duration in ticks for general movement.
 * @param teleport  The interpolation duration in ticks for teleportation. Values are clamped between 0 and 59 (inclusive).
 */
public record Interpolation(int delay, int duration, int teleport) {
    public Interpolation {
        Validation.checkArgRange(teleport, 0, 59, "teleport interpolation duration");
    }
    /**
     * The default {@link Interpolation} settings with no delay or interpolation.
     */
    static Interpolation NONE = new Interpolation(0, 0, 0);
    /**
     * A common interpolation setting with immediate start and minimal duration (1 tick).
     */
    static Interpolation MIN = new Interpolation(0, 1, 0);
    /**
     * A common interpolation setting with immediate start and minimal teleportation duration (1 tick).
     */
    static Interpolation MIN_TP = new Interpolation(0, 0, 1);
}
