package com.glance.glance.api;

import com.glance.glance.api.model.BlockModel;
import com.glance.glance.api.model.ItemModel;
import com.glance.glance.api.model.TextModel;
import net.kyori.adventure.text.Component;

import java.util.function.Consumer;

public interface Glance<ALocation, ABlock, AItem> {

    BlockModel<ABlock> spawnBlockModel(ALocation location, ABlock block);
    BlockModel<ABlock> spawnBlockModel(ALocation location, ABlock block, Consumer<BlockModel<ABlock>> editor);

    ItemModel<AItem> spawnItemModel(ALocation location, AItem item);
    ItemModel<AItem> spawnItemModel(ALocation location, AItem item, Consumer<ItemModel<AItem>> editor);

    TextModel spawnTextModel(ALocation location, Component text);
    TextModel spawnTextModel(ALocation location, Component text, Consumer<TextModel> editor);

}
