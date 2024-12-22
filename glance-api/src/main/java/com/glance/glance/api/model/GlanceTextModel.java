package com.glance.glance.api.model;

import com.glance.glance.api.model.properties.Color;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a model for rendering text with customizable properties such as alignment, background color,
 * opacity, shadow, and more.
 */
public interface GlanceTextModel {

    /**
     * Gets the text content associated with this model.
     *
     * @return The text content as a {@link Component}.
     */
    Component getTextData();

    /**
     * Sets the text content associated with this model.
     *
     * @param text The text content as a {@link Component}.
     */
    void setTextData(Component text);

    /**
     * Sets the text content and returns the model for chaining.
     *
     * @param text The text content as a {@link Component}.
     * @return This text model.
     */
    default GlanceTextModel textData(Component text) {
        setTextData(text);
        return this;
    }

    /**
     * Gets the maximum line width for wrapping text.
     *
     * @return The line width.
     */
    int getLineWidth();

    /**
     * Sets the maximum line width for wrapping text.
     *
     * @param width The line width.
     */
    void setLineWidth(int width);

    /**
     * Sets the line width and returns the model for chaining.
     *
     * @param width The line width.
     * @return This text model.
     */
    default GlanceTextModel lineWidth(int width) {
        setLineWidth(width);
        return this;
    }

    /**
     * Gets the background color of the text.
     *
     * @return The background color.
     */
    @NotNull
    Color getBackgroundColor();

    /**
     * Sets the background color of the text.
     *
     * @param color The background color.
     */
    void setBackgroundColor(@NotNull Color color);

    /**
     * Sets the background color and returns the model for chaining.
     *
     * @param color The background color.
     * @return This text model.
     */
    default GlanceTextModel backgroundColor(@NotNull Color color) {
        setBackgroundColor(color);
        return this;
    }

    /**
     * Gets the opacity level of the text.
     *
     * @return The text opacity as a byte value.
     */
    byte getTextOpacity();

    /**
     * Sets the opacity level of the text.
     *
     * @param opacity The text opacity as a byte value.
     */
    void setTextOpacity(byte opacity);

    /**
     * Sets the text opacity and returns the model for chaining.
     *
     * @param opacity The text opacity as a byte value.
     * @return This text model.
     */
    default GlanceTextModel textOpacity(byte opacity) {
        setTextOpacity(opacity);
        return this;
    }

    /**
     * Checks whether the text has a shadow.
     *
     * @return {@code true} if the text has a shadow, {@code false} otherwise.
     */
    boolean hasShadow();

    /**
     * Sets whether the text should have a shadow.
     *
     * @param shadow {@code true} to enable text shadow, {@code false} to disable it.
     */
    void setShadow(boolean shadow);

    /**
     * Sets whether the text has a shadow and returns the model for chaining.
     *
     * @param shadow {@code true} to enable text shadow, {@code false} to disable it.
     * @return This text model.
     */
    default GlanceTextModel shadow(boolean shadow) {
        setShadow(shadow);
        return this;
    }

    /**
     * Checks whether the text ignores occlusion.
     *
     * @return {@code true} if the text ignores occlusion, {@code false} otherwise.
     */
    boolean hasIgnoreOcclusion();

    /**
     * Sets whether the text should ignore occlusion.
     *
     * @param ignoreOcclusion {@code true} to ignore occlusion, {@code false} otherwise.
     */
    void setIgnoreOcclusion(boolean ignoreOcclusion);

    /**
     * Sets whether the text ignores occlusion and returns the model for chaining.
     *
     * @param ignoreOcclusion {@code true} to ignore occlusion, {@code false} otherwise.
     * @return This text model.
     */
    default GlanceTextModel ignoreOcclusion(boolean ignoreOcclusion) {
        setIgnoreOcclusion(ignoreOcclusion);
        return this;
    }

    /**
     * Checks whether the text uses the default background.
     *
     * @return {@code true} if the default background is used, {@code false} otherwise.
     */
    boolean hasDefaultBackground();

    /**
     * Sets whether the text should use the default background.
     *
     * @param defaultBackground {@code true} to use the default background, {@code false} otherwise.
     */
    void setDefaultBackground(boolean defaultBackground);

    /**
     * Sets whether the text uses the default background and returns the model for chaining.
     *
     * @param defaultBackground {@code true} to use the default background, {@code false} otherwise.
     * @return This text model.
     */
    default GlanceTextModel defaultBackground(boolean defaultBackground) {
        setDefaultBackground(defaultBackground);
        return this;
    }

    /**
     * Gets the alignment of the text.
     *
     * @return The {@link Alignment} of the text.
     */
    @NotNull
    Alignment getAlignment();

    /**
     * Sets the alignment of the text.
     *
     * @param alignment The {@link Alignment} to set.
     */
    void setAlignment(@NotNull Alignment alignment);

    /**
     * Sets the text alignment and returns the model for chaining.
     *
     * @param alignment The {@link Alignment} to set.
     * @return This text model.
     */
    default GlanceTextModel alignment(@NotNull Alignment alignment) {
        setAlignment(alignment);
        return this;
    }

    /**
     * Enum representing text alignment options.
     */
    enum Alignment {
        CENTER,
        LEFT,
        RIGHT
    }

}
