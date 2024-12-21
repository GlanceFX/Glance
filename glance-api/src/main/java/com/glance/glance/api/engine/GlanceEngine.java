package com.glance.glance.api.engine;

import com.glance.glance.api.model.BlockModel;
import com.glance.glance.api.model.ItemModel;
import com.glance.glance.api.model.TextModel;
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

    BlockModel<ABlock> spawnBlockModel(ALocation location, ABlock block);
    BlockModel<ABlock> spawnBlockModel(ALocation location, ABlock block, Consumer<BlockModel<ABlock>> editor);

    ItemModel<AItem> spawnItemModel(ALocation location, AItem item);
    ItemModel<AItem> spawnItemModel(ALocation location, AItem item, Consumer<ItemModel<AItem>> editor);

    TextModel spawnTextModel(ALocation location, Component text);
    TextModel spawnTextModel(ALocation location, Component text, Consumer<TextModel> editor);

    Renderer<ALocation> getRenderer();

    ModelTracker<AViewer> getModelTracker();

}
