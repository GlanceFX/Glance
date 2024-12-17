package com.parakeetstudios.apparition.api.model;

public interface BlockModel<ABlock> extends Model {

    ABlock getBlockData();
    void setBlockData(ABlock blockData);

}
