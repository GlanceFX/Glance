package com.glance.glance.api.model;

import com.glance.glance.api.utils.*;
import com.parakeetstudios.apparition.api.utils.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.function.Consumer;

public interface Model {

    /* Entity Data */

    @NotNull
    UUID getUniqueId();
    int getEntityId();

    /* Render Settings */

    float getViewRange();
    void setViewRange(float viewRange);
    default Model viewRange(float viewRange) {
        setViewRange(viewRange);
        return this;
    }

    @NotNull
    Shadow getShadow();
    void setShadow(@NotNull Shadow shadow);
    default Model shadow(@NotNull Shadow shadow) {
        setShadow(shadow);
        return this;
    }
    default void setShadow(float radius, float strength) {
        setShadow(new Shadow(radius, strength));
    }
    default Model shadow(float radius, float strength) {
        setShadow(radius, strength);
        return this;
    }
    float getShadowRadius();
    void setShadowRadius(float radius);
    default Model shadowRadius(float radius) {
        setShadowRadius(radius);
        return this;
    }
    float getShadowStrength();
    void setShadowStrength(float strength);
    default Model shadowStrength(float strength) {
        setShadowRadius(strength);
        return this;
    }

    @NotNull
    Culling getViewScale();
    void setViewScale(@NotNull Culling culling);
    default Model viewScale(@NotNull Culling culling) {
        setViewScale(culling);
        return this;
    }
    float getViewWidth();
    void setViewWidth(float width);
    default Model viewWidth(float width) {
        setViewWidth(width);
        return this;
    }
    float getViewHeight();
    void setViewHeight(float height);
    default Model viewHeight(float height) {
        setViewHeight(height);
        return this;
    }

    @NotNull
    Billboard getBillboard();
    void setBillboard(@NotNull Billboard billboard);

    @NotNull
    Brightness getBrightness();
    void setBrightness(@NotNull Brightness brightness);
    default void setBrightness(int blockLight, int skyLight) {
        setBrightness(new Brightness(blockLight, skyLight));
    }
    int getBlockLight();
    void setBlockLight(int blockLight);
    default Model blockLight(int blockLight) {
        setBlockLight(blockLight);
        return this;
    }
    int getSkyLight();
    void setSkyLight(int skyLight);
    default Model skyLight(int skyLight) {
        setBlockLight(skyLight);
        return this;
    }

    @NotNull
    Color getGlowColor();
    void setGlowWithColor(@NotNull Color color);
    default Model glowWithColor(@NotNull Color color) {
        setGlowWithColor(color);
        return this;
    }

    /* Interpolation */

    @NotNull
    Interpolation getInterpolation();
    void setInterpolation(@NotNull Interpolation interpolation);
    default Model interpolation(@NotNull Interpolation interpolation) {
        setInterpolation(interpolation);
        return this;
    }
    int getInterpolationDelay();
    void setInterpolationDelay(int interpolationDelay);
    default Model interpolateAfter(int delay) {
        setInterpolationDelay(delay);
        return this;
    }
    int getInterpolationDuration();
    void setInterpolationDuration(int interpolationDuration);
    default Model interpolateOver(int duration) {
        setInterpolationDuration(duration);
        return this;
    }
    int getTeleportDuration();
    void setTeleportDuration(int teleportDuration);
    default Model teleportOver(int duration) {
        setTeleportDuration(duration);
        return this;
    }

    /* Transform Matrix */

    @NotNull
    Transform getTransformation();
    void setTransform(@NotNull Transform transform);
    default Model transform(@NotNull Transform transform) {
        setTransform(transform);
        return this;
    }

    default Model editTransform(Consumer<Transform> editor) {
        Transform t = getTransformation();
        editor.accept(t);
        setTransform(t);
        return this;
    }

    default Model interpolateTransform(Consumer<Transform> editor) {
        Transform t = getTransformation();
        editor.accept(t);
        setTransform(t);
        this.setInterpolationDelay(0);
        this.setInterpolationDuration(1);
        return this;
    }

    default Model interpolateTransform(int duration, Consumer<Transform> editor) {
        Transform t = getTransformation();
        editor.accept(t);
        setTransform(t);
        this.setInterpolationDelay(0);
        this.setInterpolationDuration(duration);
        return this;
    }

    default Model interpolateTransform(int delay, int duration, Consumer<Transform> editor) {
        Transform t = getTransformation();
        editor.accept(t);
        setTransform(t);
        this.setInterpolationDelay(delay);
        this.setInterpolationDuration(duration);
        return this;
    }

    /* LifeCycle */

    void update();
    void spawn(Object viewer);
    void remove();

}
