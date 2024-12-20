package com.glance.glance.api.utils;

/**
 * Represents the shadow properties for a model, including shadow radius and shadow strength.
 * <p>
 * The shadow radius determines the size of the shadow, while the shadow strength controls its opacity
 * based on the model's distance to the block below. Both values are interpolated.
 *
 * @param shadowRadius  The radius of the shadow. Values greater than 64 are treated as 64.
 *                      If less than or equal to 0, the model has no shadow. Defaults to 0.
 * @param shadowStrength The opacity of the shadow, as a function of distance to the block below. Defaults to 1.
 */
public record Shadow(float shadowRadius, float shadowStrength) {
    public Shadow {
        Validation.checkArg(shadowRadius <= 64, "Shadow Radius should not be greater than 64");
    }
}
