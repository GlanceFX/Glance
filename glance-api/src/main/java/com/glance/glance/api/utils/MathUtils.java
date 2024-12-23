package com.glance.glance.api.utils;

import org.jetbrains.annotations.ApiStatus;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class MathUtils {

    private MathUtils() {}

    public static boolean isZeroVector(Vector3f vector3f) {
        return (vector3f.z == 0 && vector3f.y == 0 && vector3f.x == 0);
    }

    public static boolean isDefaultQuaternion(Quaternionf quaternionf) {
        return (quaternionf.x == 0 && quaternionf.y == 0 && quaternionf.z == 0 && quaternionf.w == 1);
    }

}
