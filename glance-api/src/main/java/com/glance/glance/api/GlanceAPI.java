package com.glance.glance.api;

import com.glance.glance.api.engine.GlanceEngine;
import com.glance.glance.api.model.BlockModel;
import com.glance.glance.api.utils.Validation;

public final class GlanceAPI {

    private static GlanceAPI instance;
    private static GlanceEngine<?, ?, ?, ?> runtimeEngine;


    private GlanceAPI() {}

    static {
        // todo determine runtime
        Validation.checkNotNull(runtimeEngine, "No Available Glance Engine Found");
    }

    public static synchronized GlanceAPI getInstance() {
        if (instance == null) {
            instance = new GlanceAPI();
            runtimeEngine = GlancePlatform.resolveEngine();
            runtimeEngine.initialize();
        }
        return instance;
    }

    public GlanceEngine<?, ?, ?, ?> getEngine() {
        return runtimeEngine;
    }

}
