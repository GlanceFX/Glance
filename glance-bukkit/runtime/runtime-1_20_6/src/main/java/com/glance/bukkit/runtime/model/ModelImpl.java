package com.glance.bukkit.runtime.model;

import com.glance.glance.api.model.GlanceModel;
import com.glance.glance.api.model.properties.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.UUID;
import java.util.function.Consumer;

public class ModelImpl implements GlanceModel {

    @Override
    public @NotNull UUID getUniqueId() {
        return null;
    }

    @Override
    public int getEntityId() {
        return 0;
    }

    @Override
    public float getViewRange() {
        return 0;
    }

    @Override
    public void setViewRange(float viewRange) {

    }

    @Override
    public @NotNull Shadow getShadow() {
        return null;
    }

    @Override
    public void setShadow(@NotNull Shadow shadow) {

    }

    @Override
    public float getShadowRadius() {
        return 0;
    }

    @Override
    public void setShadowRadius(float radius) {

    }

    @Override
    public float getShadowStrength() {
        return 0;
    }

    @Override
    public void setShadowStrength(float strength) {

    }

    @Override
    public @NotNull Culling getCulling() {
        return null;
    }

    @Override
    public void setCulling(@NotNull Culling culling) {

    }

    @Override
    public float getCullingWidth() {
        return 0;
    }

    @Override
    public void setCullingWidth(float width) {

    }

    @Override
    public float getCullingHeight() {
        return 0;
    }

    @Override
    public void setCullingHeight(float height) {

    }

    @Override
    public @NotNull Billboard getBillboard() {
        return null;
    }

    @Override
    public void setBillboard(@NotNull Billboard billboard) {

    }

    @Override
    public @NotNull Brightness getBrightness() {
        return null;
    }

    @Override
    public void setBrightness(@NotNull Brightness brightness) {

    }

    @Override
    public int getBlockLight() {
        return 0;
    }

    @Override
    public void setBlockLight(int blockLight) {

    }

    @Override
    public int getSkyLight() {
        return 0;
    }

    @Override
    public void setSkyLight(int skyLight) {

    }

    @Override
    public @NotNull Color getGlowColor() {
        return null;
    }

    @Override
    public void setGlowWithColor(@NotNull Color color) {

    }

    @Override
    public @NotNull Interpolation getInterpolation() {
        return null;
    }

    @Override
    public void setInterpolation(@NotNull Interpolation interpolation) {

    }

    @Override
    public int getInterpolationDelay() {
        return 0;
    }

    @Override
    public void setInterpolationDelay(int interpolationDelay) {

    }

    @Override
    public int getInterpolationDuration() {
        return 0;
    }

    @Override
    public void setInterpolationDuration(int interpolationDuration) {

    }

    @Override
    public int getTeleportDuration() {
        return 0;
    }

    @Override
    public void setTeleportDuration(int teleportDuration) {

    }

    @Override
    public GlanceModel renderAt(@NotNull Vector3f position, int duration, @Nullable Consumer<Transform> extraAction) {
        return null;
    }

    @Override
    public @NotNull Transform getTransform() {
        return null;
    }

    @Override
    public void setTransform(@NotNull Transform transform) {

    }

    @Override
    public void update() {

    }

    @Override
    public void spawn(Object viewer) {

    }

    @Override
    public void remove() {

    }
}
