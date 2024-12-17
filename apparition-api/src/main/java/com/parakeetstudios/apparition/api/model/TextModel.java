package com.parakeetstudios.apparition.api.model;

import com.parakeetstudios.apparition.api.utils.Color;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

public interface TextModel {

    Component getTextData();
    void setTextData(Component text);
    default TextModel textData(Component text) {
        setTextData(text);
        return this;
    }

    int getLineWidth();
    void setLineWidth(int width);
    default TextModel lineWidth(int width) {
        setLineWidth(width);
        return this;
    }

    @NotNull
    Color getBackgroundColor();
    void setBackgroundColor(@NotNull Color color);
    default TextModel backgroundColor(@NotNull Color color) {
        setBackgroundColor(color);
        return this;
    }

    byte getTextOpacity();
    void setTextOpacity(byte opacity);
    default TextModel textOpacity(byte opacity) {
        setTextOpacity(opacity);
        return this;
    }

    boolean hasShadow();
    void setShadow(boolean shadow);
    default TextModel shadow(boolean shadow) {
        setShadow(shadow);
        return this;
    }

    boolean hasIgnoreOcclusion();
    void setIgnoreOcclusion(boolean ignoreOcclusion);
    default TextModel ignoreOcclusion(boolean ignoreOcclusion) {
        setIgnoreOcclusion(ignoreOcclusion);
        return this;
    }

    boolean hasDefaultBackground();
    void setDefaultBackground(boolean defaultBackground);
    default TextModel defaultBackground(boolean defaultBackground) {
        setDefaultBackground(defaultBackground);
        return this;
    }

    @NotNull
    Alignment getAlignment();
    void setAlignment(@NotNull Alignment alignment);
    default TextModel alignment(@NotNull Alignment alignment) {
        setAlignment(alignment);
        return this;
    }

    enum Alignment {
        CENTER,
        LEFT,
        RIGHT
    }

}
