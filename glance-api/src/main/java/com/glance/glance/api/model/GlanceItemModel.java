package com.glance.glance.api.model;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a model that is associated with an item, allowing customization of its appearance
 * and view transformations in various rendering contexts.
 *
 * @param <AItem> The type of the item associated with this model.
 */
public interface GlanceItemModel<AItem> {

    /**
     * Gets the item associated with this model.
     *
     * @return The associated item.
     */
    @NotNull
    AItem getItem();
    /**
     * Sets the item associated with this model.
     *
     * @param item The item to associate with this model.
     */
    void setItem(@NotNull AItem item);
    /**
     * Sets the item associated with this model and returns the model for chaining.
     *
     * @param item The item to associate with this model.
     * @return This item model.
     */
    default GlanceItemModel<AItem> item(@NotNull AItem item) {
        setItem(item);
        return this;
    }

    /**
     * Gets the current view mode of the item model.
     *
     * @return The current {@link ViewTransform}.
     */
    @NotNull
    GlanceItemModel.ViewTransform getViewTransform();
    /**
     * Sets the view mode of the item model.
     *
     * @param view The {@link ViewTransform} to set.
     */
    void setViewTransform(@NotNull GlanceItemModel.ViewTransform view);
    /**
     * Sets the view mode of the item model and returns the model for chaining.
     *
     * @param view The {@link ViewTransform} to set.
     * @return This item model.
     */
    default GlanceItemModel<AItem> itemView(@NotNull GlanceItemModel.ViewTransform view) {
        setViewTransform(view);
        return this;
    }

    /**
     * Sets the item model to use a fixed view transformation.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setFixedView();
    /**
     * Sets the item model to be rendered as a head view.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setHeadView();
    /**
     * Disables all view transformations for the item model.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setNoViewTransform();
    /**
     * Sets the item model to use the GUI view transformation.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setGUIView();
    /**
     * Sets the item model to use the ground view transformation.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setGroundView();
    /**
     * Sets the item model to use the third-person left-handed view transformation.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setThirdPersonLeftView();
    /**
     * Sets the item model to use the third-person right-handed view transformation.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setThirdPersonRightView();
    /**
     * Sets the item model to use the first-person left-handed view transformation.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setFirstPersonLeftView();
    /**
     * Sets the item model to use the first-person right-handed view transformation.
     *
     * @return This item model.
     */
    GlanceItemModel<AItem> setFirstPersonRightView();

    /**
     * Enum representing the various view transformations available for an item model.
     */
    enum ViewTransform {
        NONE,
        THIRD_PERSON_LEFT,
        THIRD_PERSON_RIGHT,
        FIRST_PERSON_LEFT,
        FIRST_PERSON_RIGHT,
        HEAD,
        GUI,
        GROUND,
        FIXED;
    }


}
