package com.glance.glance.api.model;

import com.glance.glance.api.model.properties.*;
import com.glance.glance.api.utils.Validation;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public abstract class AbstractModel implements GlanceModel {

    protected int entityId;
    private final UUID uniqueId = UUID.randomUUID();
    protected boolean dirty = false;

    // Render properties
    protected float viewRange = 1.0F;
    protected float shadowRadius = 0.0f;
    protected float shadowStrength = 1.0f;

    // Lighting and Culling
    protected int blockLight = 15;
    protected int skyLight = 15;
    protected float cullingWidth = 0;
    protected float cullingHeight = 0;

    // Appearance and Transformation
    protected Billboard billboard = Billboard.FIXED;
    protected Color glowColor = Color.transparent();
    protected Transform transform = Transform.identity();

    // Interpolation and Animation
    protected int interpolationDelay = 0;
    protected int interpolationDuration = 0;
    protected int teleportDuration = 0;

    protected void markDirty() {
        this.dirty = true;
    }

    protected abstract void updateDirty();

    @Override
    public @NotNull UUID getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public int getEntityId() {
        return this.entityId;
    }

    @Override
    public float getViewRange() {
        return this.viewRange;
    }

    @Override
    public void setViewRange(float viewRange) {
        this.viewRange = viewRange;
        markDirty();
    }

    @Override
    public @NotNull Shadow getShadow() {
        return new Shadow(this.shadowRadius, this.shadowStrength);
    }

    @Override
    public void setShadow(@NotNull Shadow shadow) {
        Validation.checkNotNull(shadow, "shadow record");
        this.shadowRadius = shadow.shadowRadius();
        this.shadowStrength = shadow.shadowStrength();
        markDirty();
    }

    @Override
    public void setShadow(float radius, float strength) {
        this.shadowRadius = radius;
        this.shadowStrength = strength;
        markDirty();
    }

    @Override
    public float getShadowRadius() {
        return this.shadowRadius;
    }

    @Override
    public void setShadowRadius(float radius) {
        this.shadowRadius = radius;
        markDirty();
    }

    @Override
    public float getShadowStrength() {
        return this.shadowStrength;
    }

    @Override
    public void setShadowStrength(float strength) {
        this.shadowStrength = strength;
        markDirty();
    }

    @Override
    public @NotNull Culling getCulling() {
        return new Culling(this.cullingWidth, this.cullingHeight);
    }

    @Override
    public void setCulling(@NotNull Culling culling) {
        Validation.checkNotNull(culling, "culling record");
        this.cullingWidth = culling.width();
        this.cullingHeight = culling.height();
        markDirty();
    }

    @Override
    public void setCulling(float cullingWidth, float cullingHeight) {
        this.cullingWidth = cullingWidth;
        this.cullingHeight = cullingHeight;
        markDirty();
    }

    @Override
    public float getCullingWidth() {
        return this.cullingWidth;
    }

    @Override
    public void setCullingWidth(float width) {
        this.cullingWidth = width;
        markDirty();
    }

    @Override
    public float getCullingHeight() {
        return this.cullingHeight;
    }

    @Override
    public void setCullingHeight(float height) {
        this.cullingHeight = height;
        markDirty();
    }

    @Override
    public @NotNull Billboard getBillboard() {
        return this.billboard;
    }

    @Override
    public void setBillboard(@NotNull Billboard billboard) {
        Validation.checkNotNull(billboard, "billboard");
        this.billboard = billboard;
        markDirty();
    }

    @Override
    public @NotNull Brightness getBrightness() {
        return new Brightness(this.blockLight, this.skyLight);
    }

    @Override
    public void setBrightness(@NotNull Brightness brightness) {
        Validation.checkNotNull(brightness, "brightness record");
        this.blockLight = brightness.blockLight();
        this.skyLight = brightness.skyLight();
        markDirty();
    }

    @Override
    public void setBrightness(int blockLight, int skyLight) {
        this.blockLight = blockLight;
        this.skyLight = skyLight;
        markDirty();
    }

    @Override
    public int getBlockLight() {
        return this.blockLight;
    }

    @Override
    public void setBlockLight(int blockLight) {
        this.blockLight = blockLight;
        markDirty();
    }

    @Override
    public int getSkyLight() {
        return this.skyLight;
    }

    @Override
    public void setSkyLight(int skyLight) {
        this.skyLight = skyLight;
        markDirty();
    }

    @Override
    public @NotNull Color getGlowColor() {
        return this.glowColor;
    }

    // todo can it?
    @Override
    public void setGlowWithColor(@NotNull Color color) {
        Validation.checkNotNull(color, "glow color");
        this.glowColor = color;
        markDirty();
    }

    @Override
    public @NotNull Interpolation getInterpolation() {
        return new Interpolation(this.interpolationDelay, this.interpolationDuration, this.teleportDuration);
    }

    @Override
    public void setInterpolation(@NotNull Interpolation interpolation) {
        Validation.checkNotNull(interpolation, "interpolation record");
        this.interpolationDelay = interpolation.delay();
        this.interpolationDuration = interpolation.duration();
        this.teleportDuration = interpolation.teleport();
        markDirty();
    }

    @Override
    public int getInterpolationDelay() {
        return this.interpolationDelay;
    }

    @Override
    public void setInterpolationDelay(int interpolationDelay) {
        this.interpolationDelay = interpolationDelay;
        markDirty();
    }

    @Override
    public int getInterpolationDuration() {
        return this.interpolationDuration;
    }

    @Override
    public void setInterpolationDuration(int interpolationDuration) {
        this.interpolationDuration = interpolationDuration;
        markDirty();
    }

    @Override
    public int getTeleportDuration() {
        return this.teleportDuration;
    }

    @Override
    public void setTeleportDuration(int teleportDuration) {
        this.teleportDuration = teleportDuration;
        markDirty();
    }

    @Override
    public @NotNull Transform getTransform() {
        return this.transform;
    }

    @Override
    public void setTransform(@NotNull Transform transform) {
        Validation.checkNotNull(transform, "transform");
        this.transform = transform;
        markDirty();
    }

}
