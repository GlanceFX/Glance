package com.glance.glance.api.model;

/**
 * Represents a model associated with a block, extending the base {@link Model} interface.
 * Provides additional functionality to manage the block's state.
 *
 * @param <ABlock> The type representing the block's state.
 */
public interface BlockModel<ABlock> extends Model {

    /**
     * Gets the current state of the block associated with this model.
     *
     * @return The current block state.
     */
    ABlock getBlockState();

    /**
     * Sets the state of the block associated with this model.
     *
     * @param blockState The new block state.
     */
    void setBlockState(ABlock blockState);

    /**
     * Sets the state of the block associated with this model and returns the model for chaining.
     *
     * @param blockState The new block state.
     * @return This block model.
     */
    default BlockModel<ABlock> blockState(ABlock blockState) {
        setBlockState(blockState);
        return this;
    }

}
