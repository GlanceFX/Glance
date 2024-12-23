package com.glance.glance.api.model.properties;

/**
 * Represents the behavior of a model's orientation when rendered.
 * <p>
 * The model can pivot or remain fixed based on the specified mode:
 * <ul>
 *     <li>{@link #FIXED} - The model does not pivot (both vertical and horizontal angles remain fixed).</li>
 *     <li>{@link #VERTICAL} - The model pivots to face the viewer around the vertical axis.</li>
 *     <li>{@link #HORIZONTAL} - The model pivots to face the viewer around the horizontal axis.</li>
 *     <li>{@link #CENTER} - The model pivots to face the viewer around its center point.</li>
 * </ul>
 * <p>
 * By default, the model is rendered in the {@link #FIXED} orientation.
 */
public enum Billboard {

    /**
     * The model remains fixed; it does not pivot around any axis.
     */
    FIXED,

    /**
     * The model pivots to face the viewer around the vertical axis.
     */
    VERTICAL,

    /**
     * The model pivots to face the viewer around the horizontal axis.
     */
    HORIZONTAL,

    /**
     * The model pivots to face the viewer around its center point.
     */
    CENTER

}
