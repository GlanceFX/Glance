package com.glance.glance.api;

import com.glance.glance.api.engine.GlanceEngine;
import com.glance.glance.api.utils.Validation;

public class GlanceAPI {

    private static GlanceEngine runtimeEngine;

    static {
        // todo determine runtime
        Validation.checkNotNull(runtimeEngine, "No Available Glance Engine Found");
    }

    public static GlanceEngine getEngine() {
        return runtimeEngine;
    }

}
