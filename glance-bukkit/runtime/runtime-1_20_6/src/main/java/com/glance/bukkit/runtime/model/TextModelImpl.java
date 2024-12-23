package com.glance.bukkit.runtime.model;

import com.glance.bukkit.api.model.TextModel;
import com.glance.glance.api.model.properties.Color;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

public class TextModelImpl extends ModelImpl implements TextModel {

    @Override
    public Component getTextData() {
        return null;
    }

    @Override
    public void setTextData(Component text) {

    }

    @Override
    public int getLineWidth() {
        return 0;
    }

    @Override
    public void setLineWidth(int width) {

    }

    @Override
    public @NotNull Color getBackgroundColor() {
        return null;
    }

    @Override
    public void setBackgroundColor(@NotNull Color color) {

    }

    @Override
    public byte getTextOpacity() {
        return 0;
    }

    @Override
    public void setTextOpacity(byte opacity) {

    }

    @Override
    public boolean hasShadow() {
        return false;
    }

    @Override
    public void setShadow(boolean shadow) {

    }

    @Override
    public boolean hasIgnoreOcclusion() {
        return false;
    }

    @Override
    public void setIgnoreOcclusion(boolean ignoreOcclusion) {

    }

    @Override
    public boolean hasDefaultBackground() {
        return false;
    }

    @Override
    public void setDefaultBackground(boolean defaultBackground) {

    }

    @Override
    public @NotNull Alignment getAlignment() {
        return null;
    }

    @Override
    public void setAlignment(@NotNull Alignment alignment) {

    }
}
