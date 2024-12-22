package com.glance.bukkit.runtime.model;

import com.glance.bukkit.api.model.ItemModel;
import com.glance.glance.api.model.GlanceItemModel;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemModelImpl extends ModelImpl implements ItemModel {

    private ItemStack itemStack;
    private ViewTransform viewTransform;

    @Override
    public @NotNull ItemStack getItem() {
        return this.itemStack;
    }

    @Override
    public void setItem(@NotNull ItemStack itemStack) {
        this.itemStack = itemStack;
        // todo update
    }

    @Override
    public @NotNull ViewTransform getViewTransform() {
        return this.viewTransform;
    }

    @Override
    public void setViewTransform(@NotNull ViewTransform view) {
        this.viewTransform = view;
        // todo update
    }

    @Override
    public GlanceItemModel<ItemStack> setFixedView() {
        this.viewTransform = ViewTransform.FIXED;
        return this;
    }

    @Override
    public GlanceItemModel<ItemStack> setHeadView() {
        this.viewTransform = ViewTransform.HEAD;
        return this;
    }

    @Override
    public GlanceItemModel<ItemStack> setNoViewTransform() {
        this.viewTransform = ViewTransform.NONE;
        return this;
    }

    @Override
    public GlanceItemModel<ItemStack> setGUIView() {
        this.viewTransform = ViewTransform.GUI;
        return this;
    }

    @Override
    public GlanceItemModel<ItemStack> setGroundView() {
        this.viewTransform = ViewTransform.GROUND;
        return this;
    }

    @Override
    public GlanceItemModel<ItemStack> setThirdPersonLeftView() {
        this.viewTransform = ViewTransform.THIRD_PERSON_LEFT;
        return this;
    }

    @Override
    public GlanceItemModel<ItemStack> setThirdPersonRightView() {
        this.viewTransform = ViewTransform.THIRD_PERSON_RIGHT;
        return this;
    }

    @Override
    public GlanceItemModel<ItemStack> setFirstPersonLeftView() {
        this.viewTransform = ViewTransform.FIRST_PERSON_LEFT;
        return this;
    }

    @Override
    public GlanceItemModel<ItemStack> setFirstPersonRightView() {
        this.viewTransform = ViewTransform.FIRST_PERSON_RIGHT;
        return this;
    }
}
