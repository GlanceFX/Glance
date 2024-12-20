package com.glance.glance.api.engine;

import com.glance.glance.api.model.Model;

public interface Renderer<AViewer, ALocation> {

    void render(Model model);

}
