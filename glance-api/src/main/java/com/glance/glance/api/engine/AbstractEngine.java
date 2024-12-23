package com.glance.glance.api.engine;

import com.glance.glance.api.model.GlanceModel;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

import java.util.Set;
import java.util.UUID;

public interface AbstractEngine<AViewer, ALocation> {

    /**
     * Initializes the Glance engine for this runtime.
     */
    void initialize();

    /**
     * Determines if this engine is compatible with the current server runtime.
     *
     * @return true if compatible, false otherwise.
     */
    boolean isCompatible();

    /* Model Tracking */
    void track(@NotNull GlanceModel model);
    void release(@NotNull GlanceModel model);
    void release(@NotNull UUID modelId);
    boolean isTracked(@NotNull GlanceModel model);
    boolean isTracked(@NotNull UUID modelId);

    /* Viewers */
    void addViewer(GlanceModel model, AViewer viewer);
    void removeViewer(GlanceModel model, AViewer viewer);
    Set<AViewer> getViewers(GlanceModel model);

    /* Rendering */
    void render(GlanceModel model);
    void renderAt(GlanceModel model, ALocation location, int duration);
    void renderAt(GlanceModel model, Vector3f position, int duration);
    void teleport(GlanceModel model, ALocation location, int duration);
    void remove(GlanceModel model);

    /* Updates */
    void updateAll();
    void updateModel(GlanceModel model);
    void updateTracking(GlanceModel model);

}
