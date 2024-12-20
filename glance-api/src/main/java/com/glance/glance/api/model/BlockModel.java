package com.glance.glance.api.model;

public interface BlockModel<ABlockState> extends Model {

    ABlockState getBlockState();
    void setBlockState(ABlockState blockState);
    default BlockModel<ABlockState> blockState(ABlockState blockState) {
        setBlockState(blockState);
        return this;
    }

}
