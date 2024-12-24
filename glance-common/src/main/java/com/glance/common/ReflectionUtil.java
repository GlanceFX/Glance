package com.glance.common;

import com.glance.common.exception.ReflectionException;

import java.lang.reflect.Field;

public final class ReflectionUtil {

    private ReflectionUtil() { throw new UnsupportedOperationException("Utility clas"); }

    /**
     * Resolves a static field value from the specified class.
     *
     * @param clazz     The target class containing the field.
     * @param fieldName The name of the field to resolve.
     * @param <T>       The expected type of the field value.
     * @return The resolved field value or null if resolution fails.
     * @throws ReflectionException If the field cannot be resolved.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getStaticFieldValue(Class<?> clazz, String fieldName) throws ReflectionException {
        try {
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            return (T) field.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new ReflectionException("Failed to resolve field '" + fieldName +
                    "' in class '" + clazz.getName() + "'", e);
        }
    }

    /**
     * Resolves a static field value from the specified class but returns null if it fails.
     *
     * @param clazz     The target class containing the field.
     * @param fieldName The name of the field to resolve.
     * @param <T>       The expected type of the field value.
     * @return The resolved field value or null if resolution fails.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getStaticFieldValueOrNull(Class<?> clazz, String fieldName) {
        try {
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            return (T) field.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return null; // Return null instead of throwing exception.
        }
    }

}