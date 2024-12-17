package com.parakeetstudios.apparition.api.model;

import org.jetbrains.annotations.NotNull;

public interface ItemModel<AItem> {

    @NotNull
    AItem getItemStack();
    void setItemStack(AItem itemStack);

    @NotNull
    ItemView getItemView();

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
