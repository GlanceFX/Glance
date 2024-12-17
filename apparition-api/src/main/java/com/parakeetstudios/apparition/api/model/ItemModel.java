package com.parakeetstudios.apparition.api.model;

import org.jetbrains.annotations.NotNull;

public interface ItemModel<AItem> {

    @NotNull
    AItem getItem();
    void setItem(@NotNull AItem item);
    default ItemModel<AItem> item(@NotNull AItem item) {
        setItem(item);
        return this;
    }

    @NotNull
    ItemView getItemView();
    void setItemView(@NotNull ItemView view);
    default ItemModel<AItem> itemView(@NotNull ItemView view) {
        setItemView(view);
        return this;
    }

    ItemModel<AItem> setFixedView();
    ItemModel<AItem> setHeadView();
    ItemModel<AItem> setNoViewTransform();
    ItemModel<AItem> setGUIView();
    ItemModel<AItem> setGroundView();
    ItemModel<AItem> setThirdPersonLeftView();
    ItemModel<AItem> setThirdPersonRightView();
    ItemModel<AItem> setFirstPersonLeftView();
    ItemModel<AItem> setFirstPersonRightView();

    enum ItemView {
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
