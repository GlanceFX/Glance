package com.glance.glance.api.model;

import com.glance.glance.api.utils.Validation;
import com.glance.glance.api.utils.MathUtils;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import java.util.function.Consumer;

public class Transform {

    @NotNull
    private Vector3f translation;
    @NotNull
    private Quaternionf leftRotation;
    @NotNull
    private Vector3f scale;
    @NotNull
    private Quaternionf rightRotation;

    public Transform() {
        this(
            new Vector3f(),
            new Quaternionf(),
            new Vector3f(1, 1, 1),
            new Quaternionf()
        );
    }

    public static Transform identity() {
        return new Transform();
    }

    public static Transform fromMatrix(Matrix4f mat) {
        return new Transform(
                mat.getTranslation(new Vector3f()),
                mat.getUnnormalizedRotation(new Quaternionf()),
                mat.getScale(new Vector3f()),
                new Quaternionf()
        );
    }

    public Transform(
        @NotNull Vector3f translation,
        @NotNull Quaternionf leftRotation,
        @NotNull Vector3f scale,
        @NotNull Quaternionf rightRotation
    ) {
        Validation.checkNotNull(translation, "translation cannot be null");
        Validation.checkNotNull(leftRotation, "leftRotation cannot be null");
        Validation.checkNotNull(scale, "scale cannot be null");
        Validation.checkNotNull(rightRotation, "rightRotation cannot be null");
        this.translation = translation;
        this.leftRotation = leftRotation;
        this.scale = scale;
        this.rightRotation = rightRotation;
    }

    @NotNull
    public Vector3f getTranslation() {
        return this.translation;
    }

    public Transform setTranslation(@NotNull Vector3f translation) {
        Validation.checkNotNull(translation, "translation cannot be null");
        this.translation = translation;
        return this;
    }

    public Transform editTranslation(Consumer<Vector3f> editor) {
        editor.accept(this.translation);
        return this;
    }

    public Transform translate(float x, float y, float z) {
        this.translation.add(x, y, z);
        return this;
    }

    public Transform translate(Vector3f translation) {
        this.translation.add(translation);
        return this;
    }

    @NotNull
    public Quaternionf getLeftRotation() {
        return this.leftRotation;
    }

    public Transform setLeftRotation(@NotNull Quaternionf leftRotation) {
        Validation.checkNotNull(leftRotation, "leftRotation cannot be null");
        this.leftRotation = leftRotation;
        return this;
    }

    public Transform editLeftRotation(Consumer<Quaternionf> editor) {
        editor.accept(this.leftRotation);
        return this;
    }

    public Transform rotateLeft(float angle, float axisX, float axisY, float axisZ) {
        this.leftRotation.rotateAxis(angle, axisX, axisY, axisZ);
        return this;
    }

    public Transform rotateLeft(float angle, Vector3f rotation) {
        this.leftRotation.rotateAxis(angle, rotation);
        return this;
    }

    @NotNull
    public Vector3f getScale() {
        return this.scale;
    }

    public Transform setScale(@NotNull Vector3f scale) {
        Validation.checkNotNull(scale, "scale cannot be null");
        this.scale = scale;
        return this;
    }

    public Transform editScale(Consumer<Vector3f> editor) {
        editor.accept(this.scale);
        return this;
    }

    public Transform scale(float scalar) {
        this.scale.mul(scalar);
        return this;
    }

    public Transform scale(float x, float y, float z) {
        this.scale.mul(x, y, z);
        return this;
    }

    public Transform scale(Vector3f scalar) {
        this.scale.mul(scalar.x, scalar.y, scalar.z);
        return this;
    }

    @NotNull
    public Quaternionf getRightRotation() {
        return this.rightRotation;
    }

    public Transform setRightRotation(@NotNull Quaternionf rightRotation) {
        Validation.checkNotNull(rightRotation, "rightRotation cannot be null");
        this.rightRotation = rightRotation;
        return this;
    }

    public Transform editRightRotation(Consumer<Quaternionf> editor) {
        editor.accept(this.rightRotation);
        return this;
    }

    public Transform rotateRight(float angle, float axisX, float axisY, float axisZ) {
        this.rightRotation.rotateAxis(angle, axisX, axisY, axisZ);
        return this;
    }

    public Transform rotateRight(float angle, Vector3f rotation) {
        this.rightRotation.rotateAxis(angle, rotation);
        return this;
    }

    public Matrix4f getMatrix() {
        Matrix4f mat = new Matrix4f();
        mat.translate(translation);
        mat.scale(scale);
        mat.rotate(leftRotation);
        if (!MathUtils.isDefaultQuaternion(rightRotation)) {
            mat.rotate(rightRotation);
        }
        return mat;
    }

}
