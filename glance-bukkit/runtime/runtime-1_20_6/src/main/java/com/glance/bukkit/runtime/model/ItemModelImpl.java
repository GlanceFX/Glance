package com.glance.bukkit.runtime.model;

import com.glance.bukkit.api.model.ItemModel;
import com.glance.glance.api.utils.Validation;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemModelImpl extends ModelImpl implements ItemModel {

    private ItemStack itemStack = ItemStack.empty();
    private ViewTransform viewTransform;

    @Override
    public @NotNull ItemStack getItem() {
        return this.itemStack;
    }

    @Override
    public void setItem(@NotNull ItemStack itemStack) {
        this.itemStack = Validation.checkNotNull(itemStack, "itemStack");
        markDirty();
    }

    @Override
    public @NotNull ViewTransform getViewTransform() {
        return this.viewTransform;
    }

    @Override
    public void setViewTransform(@NotNull ViewTransform view) {
        this.viewTransform = Validation.checkNotNull(view, "view transform");
        markDirty();
    }

    @Override
    public ItemModel setFixedView() {
        this.viewTransform = ViewTransform.FIXED;
        return this;
    }

    @Override
    public ItemModel setHeadView() {
        this.viewTransform = ViewTransform.HEAD;
        return this;
    }

    @Override
    public ItemModel setNoViewTransform() {
        this.viewTransform = ViewTransform.NONE;
        return this;
    }

    @Override
    public ItemModel setGUIView() {
        this.viewTransform = ViewTransform.GUI;
        return this;
    }

    @Override
    public ItemModel setGroundView() {
        this.viewTransform = ViewTransform.GROUND;
        return this;
    }

    @Override
    public ItemModel setThirdPersonLeftView() {
        this.viewTransform = ViewTransform.THIRD_PERSON_LEFT;
        return this;
    }

    @Override
    public ItemModel setThirdPersonRightView() {
        this.viewTransform = ViewTransform.THIRD_PERSON_RIGHT;
        return this;
    }

    @Override
    public ItemModel setFirstPersonLeftView() {
        this.viewTransform = ViewTransform.FIRST_PERSON_LEFT;
        return this;
    }

    @Override
    public ItemModel setFirstPersonRightView() {
        this.viewTransform = ViewTransform.FIRST_PERSON_RIGHT;
        return this;
    }
}
