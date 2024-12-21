package com.glance.glance.api;

import com.glance.glance.api.engine.GlanceEngine;

import java.util.ServiceLoader;

public final class GlancePlatform {

    private GlancePlatform(){}

    public static GlanceEngine<?, ?, ?, ?> resolveEngine() {
        ServiceLoader<GlanceEngine> loader = ServiceLoader.load(GlanceEngine.class);

        for (GlanceEngine<?, ?, ?, ?> engine : loader) {
            if (engine.isCompatible()) {
                return engine;
            }
        }

        throw new IllegalStateException("No compatible GlanceEngine found for server runtime");
    }

}
