package com.glance.glance.api.model;

/**
 * Represents a model associated with a block, extending the base {@link Model} interface.
 * Provides additional functionality to manage the block's state.
 *
 * @param <ABlockState> The type representing the block's state.
 */
public interface BlockModel<ABlockState> extends Model {

    /**
     * Gets the current state of the block associated with this model.
     *
     * @return The current block state.
     */
    ABlockState getBlockState();

    /**
     * Sets the state of the block associated with this model.
     *
     * @param blockState The new block state.
     */
    void setBlockState(ABlockState blockState);

    /**
     * Sets the state of the block associated with this model and returns the model for chaining.
     *
     * @param blockState The new block state.
     * @return This block model.
     */
    default BlockModel<ABlockState> blockState(ABlockState blockState) {
        setBlockState(blockState);
        return this;
    }

}
