package com.glance.glance.api.engine;

import com.glance.glance.api.model.GlanceModel;

public interface GlanceRenderer<ALocation> {

    void render(GlanceModel model);

    void renderAt(GlanceModel model, ALocation location, int duration);

    void teleport(GlanceModel model, ALocation location);

    default void teleport(GlanceModel model, ALocation location, int duration) {
        teleport(model, location);
        model.setTeleportDuration(duration);
    }

    void remove(GlanceModel model);

}
