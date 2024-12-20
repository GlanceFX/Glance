package com.glance.glance.api.utils;

/**
 * Represents the culling bounding box dimensions for a model, controlling when parts of the model
 * are rendered based on its size and position.
 * <p>
 * Culling determines which parts of the model are not rendered when they are out of view. Both
 * width and height affect the model's rendering boundaries:
 * <ul>
 *     <li>{@code width} - The maximum horizontal size of the model. The culling box spans horizontally
 *         from {@code width / 2} in both directions around the model's position.</li>
 *     <li>{@code height} - The maximum vertical size of the model. The culling box spans vertically
 *         from {@code y} to {@code y + height}.</li>
 * </ul>
 * If either {@code width} or {@code height} is set to {@code 0}, no culling will occur on the corresponding axis.
 * By default, both values are {@code 0}, meaning no culling is applied.
 *
 * @param width  The maximum width of the model. Defaults to {@code 0}.
 * @param height The maximum height of the model. Defaults to {@code 0}.
 */
public record Culling(float width, float height) {
}
