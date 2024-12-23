package com.glance.bukkit.runtime.engine;

import com.glance.bukkit.api.engine.GlanceEngine;
import com.glance.glance.api.model.GlanceModel;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

import java.util.Set;
import java.util.UUID;

public class EngineImpl implements GlanceEngine {

    @Override
    public void initialize() {

    }

    @Override
    public boolean isCompatible() {
        return false;
    }

    @Override
    public void track(@NotNull GlanceModel model) {

    }

    @Override
    public void release(@NotNull GlanceModel model) {

    }

    @Override
    public void release(@NotNull UUID modelId) {

    }

    @Override
    public boolean isTracked(@NotNull GlanceModel model) {
        return false;
    }

    @Override
    public boolean isTracked(@NotNull UUID modelId) {
        return false;
    }

    @Override
    public void addViewer(GlanceModel model, Player player) {

    }

    @Override
    public void removeViewer(GlanceModel model, Player player) {

    }

    @Override
    public Set<Player> getViewers(GlanceModel model) {
        return Set.of();
    }

    @Override
    public void render(GlanceModel model) {

    }

    @Override
    public void renderAt(GlanceModel model, Location location, int duration) {

    }

    @Override
    public void renderAt(GlanceModel model, Vector3f position, int duration) {

    }

    @Override
    public void teleport(GlanceModel model, Location location, int duration) {

    }

    @Override
    public void remove(GlanceModel model) {

    }

    @Override
    public void updateAll() {

    }

    @Override
    public void updateModel(GlanceModel model) {

    }

    @Override
    public void updateTracking(GlanceModel model) {

    }

}
