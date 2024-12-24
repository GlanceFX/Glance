package com.glance.glance.api.model;

import com.glance.glance.api.model.properties.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;

import java.util.UUID;
import java.util.function.Consumer;

/**
 * Represents a model entity with configurable rendering, interpolation, transformation, and lifecycle behavior.
 * Provides a fluent API for setting various properties.
 */
public interface GlanceModel {

    /* Entity Data */

    /**
     * Gets the unique identifier of the model entity.
     *
     * @return The unique ID of the entity.
     */
    @NotNull
    UUID getUniqueId();

    /**
     * Gets the entity's ID.
     *
     * @return The entity ID.
     */
    int getEntityId();

    /* Render Settings */

    /**
     * Gets the view range of the model.
     *
     * @return The view range.
     */
    float getViewRange();
    /**
     * Sets the view range of the model.
     *
     * @param viewRange The new view range.
     */
    void setViewRange(float viewRange);
    /**
     * Sets the view range and returns the model for chaining.
     *
     * @param viewRange The new view range.
     * @return This model.
     */
    default GlanceModel viewRange(float viewRange) {
        setViewRange(viewRange);
        return this;
    }

    /**
     * Gets the shadow settings of the model.
     *
     * @return The shadow settings.
     */
    @NotNull
    Shadow getShadow();
    /**
     * Sets the shadow settings of the model.
     *
     * @param shadow The new shadow settings.
     */
    void setShadow(@NotNull Shadow shadow);
    /**
     * Sets the shadow settings and returns the model for chaining.
     *
     * @param shadow The new shadow settings.
     * @return This model.
     */
    default GlanceModel shadow(@NotNull Shadow shadow) {
        setShadow(shadow);
        return this;
    }
    /**
     * Sets the shadow settings using radius and strength.
     *
     * @param radius   The shadow radius.
     * @param strength The shadow strength.
     */
    default void setShadow(float radius, float strength) {
        setShadow(new Shadow(radius, strength));
    }
    /**
     * Sets the shadow settings using radius and strength and returns the model for chaining.
     *
     * @param radius   The shadow radius.
     * @param strength The shadow strength.
     * @return This model.
     */
    default GlanceModel shadow(float radius, float strength) {
        setShadow(radius, strength);
        return this;
    }
    /**
     * Gets the shadow radius.
     *
     * @return The shadow radius.
     */
    float getShadowRadius();
    /**
     * Sets the shadow radius.
     *
     * @param radius The shadow radius.
     */
    void setShadowRadius(float radius);
    /**
     * Sets the shadow radius and returns the model for chaining.
     *
     * @param radius The shadow radius.
     * @return This model.
     */
    default GlanceModel shadowRadius(float radius) {
        setShadowRadius(radius);
        return this;
    }
    /**
     * Gets the shadow strength.
     *
     * @return The shadow strength.
     */
    float getShadowStrength();
    /**
     * Sets the shadow strength.
     *
     * @param strength The shadow strength.
     */
    void setShadowStrength(float strength);
    /**
     * Sets the shadow strength and returns the model for chaining.
     *
     * @param strength The shadow strength.
     * @return This model.
     */
    default GlanceModel shadowStrength(float strength) {
        setShadowRadius(strength);
        return this;
    }

    /**
     * Gets the culling/view scale settings of the model.
     *
     * @return The culling settings.
     */
    @NotNull
    Culling getCulling();
    /**
     * Sets the culling/view scale settings of the model.
     *
     * @param culling The new culling settings.
     */
    void setCulling(@NotNull Culling culling);
    /**
     * Sets the culling/view scale settings of the model.
     *
     * @param cullingWidth The new culling width.
     * @param cullingHeight The new culling height.
     */
    void setCulling(float cullingWidth, float cullingHeight);
    /**
     * Sets the culling settings and returns the model for chaining.
     *
     * @param culling The new culling settings.
     * @return This model.
     */
    default GlanceModel culling(@NotNull Culling culling) {
        setCulling(culling);
        return this;
    }

    /**
     * Gets the culling width.
     *
     * @return The culling width.
     */
    float getCullingWidth();
    /**
     * Sets the culling width.
     *
     * @param width The culling width.
     */
    void setCullingWidth(float width);
    /**
     * Sets the culling width and returns the model for chaining.
     *
     * @param width The culling width.
     * @return This model.
     */
    default GlanceModel cullingWidth(float width) {
        setCullingWidth(width);
        return this;
    }

    /**
     * Gets the culling height.
     *
     * @return The culling height.
     */
    float getCullingHeight();
    /**
     * Sets the culling height.
     *
     * @param height The culling height.
     */
    void setCullingHeight(float height);
    /**
     * Sets the culling height and returns the model for chaining.
     *
     * @param height The culling height.
     * @return This model.
     */
    default GlanceModel cullingHeight(float height) {
        setCullingHeight(height);
        return this;
    }

    /**
     * Gets the billboard settings of the model.
     *
     * @return The billboard settings.
     */
    @NotNull
    Billboard getBillboard();
    /**
     * Sets the billboard settings of the model.
     *
     * @param billboard The new billboard settings.
     */
    void setBillboard(@NotNull Billboard billboard);

    /**
     * Gets the brightness settings of the model.
     *
     * @return The brightness settings.
     */
    @NotNull
    Brightness getBrightness();
    /**
     * Sets the brightness settings of the model.
     *
     * @param brightness The new brightness settings.
     */
    void setBrightness(@NotNull Brightness brightness);
    /**
     * Sets the brightness settings using block light and skylight values.
     *
     * @param blockLight The block light value.
     * @param skyLight   The skylight value.
     */
    default void setBrightness(int blockLight, int skyLight) {
        setBrightness(new Brightness(blockLight, skyLight));
    }
    /**
     * Gets the block light level.
     *
     * @return The block light level.
     */
    int getBlockLight();
    /**
     * Sets the block light level.
     *
     * @param blockLight The block light level.
     */
    void setBlockLight(int blockLight);
    /**
     * Sets the block light level and returns the model for chaining.
     *
     * @param blockLight The block light level.
     * @return This model.
     */
    default GlanceModel blockLight(int blockLight) {
        setBlockLight(blockLight);
        return this;
    }
    /**
     * Gets the skylight level.
     *
     * @return The skylight level.
     */
    int getSkyLight();
    /**
     * Sets the skylight level.
     *
     * @param skyLight The skylight level.
     */
    void setSkyLight(int skyLight);
    /**
     * Sets the skylight level and returns the model for chaining.
     *
     * @param skyLight The skylight level.
     * @return This model.
     */
    default GlanceModel skyLight(int skyLight) {
        setBlockLight(skyLight);
        return this;
    }

    /**
     * Gets the glow color of the model.
     *
     * @return The glow color.
     */
    @NotNull
    Color getGlowColor();
    /**
     * Sets the glow color of the model.
     *
     * @param color The new glow color.
     */
    void setGlowWithColor(@NotNull Color color);
    /**
     * Sets the glow color and returns the model for chaining.
     *
     * @param color The new glow color.
     * @return This model.
     */
    default GlanceModel glowWithColor(@NotNull Color color) {
        setGlowWithColor(color);
        return this;
    }

    /* Interpolation */

    /**
     * Gets the interpolation settings of the model.
     *
     * @return The interpolation settings.
     */
    @NotNull
    Interpolation getInterpolation();
    /**
     * Sets the interpolation settings of the model.
     *
     * @param interpolation The new interpolation settings.
     */
    void setInterpolation(@NotNull Interpolation interpolation);
    /**
     * Sets the interpolation settings and returns the model for chaining.
     *
     * @param interpolation The new interpolation settings.
     * @return This model.
     */
    default GlanceModel interpolation(@NotNull Interpolation interpolation) {
        setInterpolation(interpolation);
        return this;
    }
    /**
     * Gets the interpolation delay.
     *
     * @return The interpolation delay in ticks.
     */
    int getInterpolationDelay();
    /**
     * Sets the interpolation delay.
     *
     * @param interpolationDelay The interpolation delay in ticks.
     */
    void setInterpolationDelay(int interpolationDelay);
    /**
     * Sets the interpolation delay and returns the model for chaining.
     *
     * @param delay The interpolation delay in ticks.
     * @return This model.
     */
    default GlanceModel interpolateAfter(int delay) {
        setInterpolationDelay(delay);
        return this;
    }
    /**
     * Gets the interpolation duration.
     *
     * @return The interpolation duration in ticks.
     */
    int getInterpolationDuration();
    /**
     * Sets the interpolation duration.
     *
     * @param interpolationDuration The interpolation duration in ticks.
     */
    void setInterpolationDuration(int interpolationDuration);
    /**
     * Sets the interpolation duration and returns the model for chaining.
     *
     * @param duration The interpolation duration in ticks.
     * @return This model.
     */
    default GlanceModel interpolateOver(int duration) {
        setInterpolationDuration(duration);
        return this;
    }
    /**
     * Gets the teleport interpolation duration.
     *
     * @return The teleport interpolation duration in ticks.
     */
    int getTeleportDuration();
    /**
     * Sets the teleport interpolation duration.
     *
     * @param teleportDuration The teleport interpolation duration in ticks.
     */
    void setTeleportDuration(int teleportDuration);
    /**
     * Sets the teleport interpolation duration and returns the model for chaining.
     *
     * @param duration The teleport interpolation duration in ticks.
     * @return This model.
     */
    default GlanceModel teleportDuration(int duration) {
        setTeleportDuration(duration);
        return this;
    }

    /**
     * Renders the model at a given projected location, applying interpolation over a specified duration.
     * This function calculates the difference between the display's current position and the desired
     * render location, then applies this difference as a translation to the model's transform.
     *
     * @param position The target position (world co-ordinates) where the model should be visually rendered.
     * @param duration The interpolation duration, in ticks, over which the transition should occur.
     * @param extraAction A lambda that allows for additional customization of the model's transform.
     */
    GlanceModel renderAt(@NotNull Vector3f position, int duration, @Nullable Consumer<Transform> extraAction);

    /**
     * Renders the model at a given projected location, applying interpolation over a specified duration.
     * This function calculates the difference between the display's current position and the desired
     * render location, then applies this difference as a translation to the model's transform.
     *
     * @param position The target position (world co-ordinates) where the model should be visually rendered.
     * @param extraAction A lambda that allows for additional customization of the model's transform.
     */
    GlanceModel renderAt(@NotNull Vector3f position, @Nullable Consumer<Transform> extraAction);

    /**
     * Renders the model at a given projected location, applying interpolation over a specified duration.
     * This function calculates the difference between the display's current position and the desired
     * render location, then applies this difference as a translation to the model's transform.
     *
     * @param position The target position (world co-ordinates) where the model should be visually rendered.
     */
    GlanceModel renderAt(@NotNull Vector3f position);

    /**
     * Gets the absolute position of this model in WorldSpace coords
     *
     * @return the absolute worldspace position
     */
    @NotNull
    Vector3f getAbsolutePosition();

    /**
     * Gets the relative render position of this model.
     * This is a relative vector to the absolute worldspace position
     *
     * @return the relative position vector
     */
    @NotNull
    Vector3f getRelativePosition();

    /* Transform & Matrix */

    /**
     * Gets the transform of the model.
     *
     * @return The transform.
     */
    @NotNull
    Transform getTransform();
    /**
     * Sets the transform of the model.
     *
     * @param transform The new transform.
     */
    void setTransform(@NotNull Transform transform);
    /**
     * Sets the transform and returns the model for chaining.
     *
     * @param transform The new transform.
     * @return This model.
     */
    default GlanceModel transform(@NotNull Transform transform) {
        setTransform(transform);
        return this;
    }

    /**
     * Gets the transformation matrix of the model.
     *
     * @return The transformation matrix.
     */
    @NotNull
    default Matrix4f getTransformMatrix() {
        return getTransform().getMatrix();
    }


    /**
     * Sets the transformation matrix of the model.
     *
     * @param matrix The new transformation matrix.
     */
    default void setTransformationMatrix(@NotNull Matrix4f matrix) {
        this.setTransform(Transform.fromMatrix(matrix));
    }

    /**
     * Sets the transformation matrix and returns the model for chaining.
     *
     * @param matrix The new transformation matrix.
     * @return This model.
     */
    default GlanceModel transformationMatrix(@NotNull Matrix4f matrix) {
        this.setTransform(Transform.fromMatrix(matrix));
        return this;
    }

    /**
     * Edits the transform using a custom editor function.
     *
     * @param editor A consumer that modifies the transform.
     * @return This model.
     */
    default GlanceModel editTransform(@NotNull Consumer<Transform> editor) {
        Transform t = getTransform();
        editor.accept(t);
        setTransform(t);
        return this;
    }

    /**
     * Applies an immediate interpolation to the transform using a custom editor function.
     *
     * @param editor A consumer that modifies the transform.
     * @return This model.
     */
    default GlanceModel interpolateTransform(@NotNull Consumer<Transform> editor) {
        this.setInterpolationDelay(0);
        this.setInterpolationDuration(1);
        return editTransform(editor);
    }

    /**
     * Applies an interpolation to the transform over a specified duration.
     *
     * @param duration The interpolation duration in ticks.
     * @param editor   A consumer that modifies the transform.
     * @return This model.
     */
    default GlanceModel interpolateTransform(int duration, @NotNull Consumer<Transform> editor) {
        this.setInterpolationDelay(0);
        this.setInterpolationDuration(duration);
        return editTransform(editor);
    }

    /**
     * Applies an interpolation to the transform with a specified delay and duration.
     *
     * @param delay    The interpolation delay in ticks.
     * @param duration The interpolation duration in ticks.
     * @param editor   A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default GlanceModel interpolateTransform(int delay, int duration, @NotNull Consumer<Transform> editor) {
        this.setInterpolationDelay(delay);
        this.setInterpolationDuration(duration);
        return editTransform(editor);
    }

    /**
     * Edits the transformation matrix using a custom editor function.
     *
     * @param editor A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default GlanceModel editMatrix(@NotNull Consumer<Matrix4f> editor) {
        Matrix4f mat4 = getTransformMatrix();
        editor.accept(mat4);
        setTransform(Transform.fromMatrix(mat4));
        return this;
    }

    /**
     * Applies an interpolation to the transformation matrix with a specified delay and duration.
     *
     * @param editor   A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default GlanceModel interpolateMatrix(@NotNull Consumer<Matrix4f> editor) {
        this.setInterpolationDelay(0);
        this.setInterpolationDuration(1);
        return editMatrix(editor);
    }

    /**
     * Applies an interpolation to the transformation matrix with a specified delay and duration.
     *
     * @param duration The interpolation duration in ticks.
     * @param editor   A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default GlanceModel interpolateMatrix(int duration, @NotNull Consumer<Matrix4f> editor) {
        this.setInterpolationDelay(0);
        this.setInterpolationDuration(duration);
        return editMatrix(editor);
    }

    /**
     * Applies an interpolation to the transformation matrix with a specified delay and duration.
     *
     * @param delay    The interpolation delay in ticks.
     * @param duration The interpolation duration in ticks.
     * @param editor   A consumer that modifies the transformation matrix.
     * @return This model.
     */
    default GlanceModel interpolateMatrix(int delay, int duration, @NotNull Consumer<Matrix4f> editor) {
        this.setInterpolationDelay(delay);
        this.setInterpolationDuration(duration);
        return editMatrix(editor);
    }

    /* Direct transform access */

    /**
     * Scales the model uniformly.
     *
     * @param scale The scale factor to apply uniformly.
     * @return This model.
     */
    default GlanceModel scale(float scale) {
        return editTransform(t -> t.scale(scale));
    }

    /**
     * Scales the model along the X, Y, and Z axes.
     *
     * @param x The scale factor along the X-axis.
     * @param y The scale factor along the Y-axis.
     * @param z The scale factor along the Z-axis.
     * @return This model.
     */
    default GlanceModel scale(float x, float y, float z) {
        return editTransform(t -> t.scale(x,y,z));
    }

    /**
     * Translates the model by the specified offsets.
     *
     * @param x The offset along the X-axis.
     * @param y The offset along the Y-axis.
     * @param z The offset along the Z-axis.
     * @return This model.
     */
    default GlanceModel translate(float x, float y, float z) {
        return editTransform(t -> t.translate(x, y, z));
    }

    /**
     * Translates the model to the specified position.
     *
     * @param position The target position.
     * @return This model.
     */
    default GlanceModel translate(@NotNull Vector3f position) {
        return editTransform(t -> t.setTranslation(position));
    }

    /**
     * Rotates the model to the left around the specified axis.
     *
     * @param angle The rotation angle in radians.
     * @param axisX The X component of the axis vector.
     * @param axisY The Y component of the axis vector.
     * @param axisZ The Z component of the axis vector.
     * @return This model.
     */
    default GlanceModel rotateLeft(float angle, float axisX, float axisY, float axisZ) {
        return editTransform(t -> t.rotateLeft(angle, axisX, axisY, axisZ));
    }

    /**
     * Rotates the model to the left around the specified axis vector.
     *
     * @param angle The rotation angle in radians.
     * @param axis The axis vector.
     * @return This model.
     */
    default GlanceModel rotateLeft(float angle, @NotNull Vector3f axis) {
        return editTransform(t -> t.rotateLeft(angle, axis));
    }

    /**
     * Rotates the model to the right around the specified axis.
     *
     * @param angle The rotation angle in radians.
     * @param axisX The X component of the axis vector.
     * @param axisY The Y component of the axis vector.
     * @param axisZ The Z component of the axis vector.
     * @return This model.
     */
    default GlanceModel rotateRight(float angle, float axisX, float axisY, float axisZ) {
        return editTransform(t -> t.rotateRight(angle, axisX, axisY, axisZ));
    }

    /**
     * Rotates the model to the right around the specified axis vector.
     *
     * @param angle The rotation angle in radians.
     * @param axis The axis vector.
     * @return This model.
     */
    default GlanceModel rotateRight(float angle, @NotNull Vector3f axis) {
        return editTransform(t -> t.rotateRight(angle, axis));
    }

    /**
     * Applies a transformation matrix directly to the model.
     *
     * @param matrix The transformation matrix to apply.
     * @return This model.
     */
    default GlanceModel applyMatrix(@NotNull Matrix4f matrix) {
        return editMatrix(mat -> mat.mul(matrix));
    }

    /**
     * Sets the model's transformation matrix to an identity matrix.
     *
     * @return This model.
     */
    default GlanceModel resetMatrix() {
        return editMatrix(Matrix4f::identity);
    }

}
