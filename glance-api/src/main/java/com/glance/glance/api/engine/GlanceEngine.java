package com.glance.glance.api.engine;

import com.glance.glance.api.model.GlanceBlockModel;
import com.glance.glance.api.model.GlanceItemModel;
import com.glance.glance.api.model.GlanceTextModel;
import net.kyori.adventure.text.Component;

import java.util.function.Consumer;

public interface GlanceEngine<AViewer, ALocation, ABlock, AItem> {

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

    GlanceBlockModel<ABlock> spawnBlockModel(ALocation location, ABlock block);
    GlanceBlockModel<ABlock> spawnBlockModel(ALocation location, ABlock block, Consumer<GlanceBlockModel<ABlock>> editor);

    GlanceItemModel<AItem> spawnItemModel(ALocation location, AItem item);
    GlanceItemModel<AItem> spawnItemModel(ALocation location, AItem item, Consumer<GlanceItemModel<AItem>> editor);

    GlanceTextModel spawnTextModel(ALocation location, Component text);
    GlanceTextModel spawnTextModel(ALocation location, Component text, Consumer<GlanceTextModel> editor);

    GlanceRenderer<ALocation> getRenderer();

    GlanceModelTracker<AViewer> getModelTracker();

}
