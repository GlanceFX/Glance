package com.glance.bukkit.api;

import com.glance.bukkit.api.engine.GlanceEngine;
import com.glance.bukkit.api.model.BlockModel;
import com.glance.bukkit.api.model.ItemModel;
import com.glance.bukkit.api.model.TextModel;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

public interface GlanceAPI {

    GlanceEngine getEngine();

    BlockModel createBlockModel(Location location, BlockData blockData);
    BlockModel createBlockModel(Location location, BlockData blockData, Consumer<BlockModel> editor);

    ItemModel createItemModel(Location location, ItemStack itemStack);
    ItemModel createItemModel(Location location, ItemStack itemStack, Consumer<ItemModel> editor);

    TextModel createTextModel(Location location, Component text);
    TextModel createTextModel(Location location, Component text, Consumer<TextModel> editor);

}