package com.glance.bukkit.runtime.model;

import com.glance.bukkit.api.model.BlockModel;
import com.glance.glance.api.utils.Validation;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.NotNull;

public class BlockModelImpl extends ModelImpl implements BlockModel {

    @NotNull
    protected BlockData blockState = Material.AIR.createBlockData();

    @NotNull
    @Override
    public BlockData getBlockState() {
        return this.blockState;
    }

    @Override
    public void setBlockState(@NotNull BlockData blockState) {
        this.blockState = Validation.checkNotNull(blockState, "blockState");
        markDirty();
    }
}
