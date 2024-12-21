package com.glance.glance.api.engine;

import com.glance.glance.api.model.Model;

public interface Renderer<ALocation> {

    void render(Model model);

    void renderAt(Model model, ALocation location, int duration);

    void teleport(Model model, ALocation location);

    default void teleport(Model model, ALocation location, int duration) {
        teleport(model, location);
        model.setTeleportDuration(duration);
    }

    void remove(Model model);

}
