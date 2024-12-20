package com.glance.glance.api.utils;

public final class Validation {

    private Validation() {}

    /**
     * Checks if a condition is true; otherwise, throws an IllegalStateException.
     *
     * @param condition the condition to check
     * @param message   the exception message if the condition fails
     * @throws IllegalStateException if the condition is false
     */
    public static void check(boolean condition, String message) {
        if (!condition) {
            throw new IllegalStateException(message);
        }
    }

    /**
     * Checks if an arg condition is true; otherwise, throws an IllegalArgumentException.
     *
     * @param condition the condition to check
     * @param message   the exception message if the condition fails
     * @throws IllegalArgumentException if the condition is false
     */
    public static void checkArg(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Checks if an object is not null; otherwise, throws a NullPointerException.
     *
     * @param obj     the object to check
     * @param message the exception message if the object is null
     * @param <T>     the type of the object
     * @return the validated object
     * @throws NullPointerException if the object is null
     */
    public static <T> T checkNotNull(T obj, String message) {
        if (obj == null) {
            throw new NullPointerException(message);
        }
        return obj;
    }

    /**
     * Checks if a value is within a specific range; otherwise, throws an IllegalStateException.
     *
     * @param value the value to check
     * @param min   the minimum value (inclusive)
     * @param max   the maximum value (inclusive)
     * @param name  the name of the value for the exception message
     * @throws IllegalStateException if the value is out of range
     */
    public static void checkRange(int value, int min, int max, String name) {
        if (value < min || value > max) {
            throw new IllegalStateException(name + " must be between " + min + " and " + max + ", but was " + value);
        }
    }

    /**
     * Checks if an arg value is within a specific range; otherwise, throws an IllegalArgumentException.
     *
     * @param value the value to check
     * @param min   the minimum value (inclusive)
     * @param max   the maximum value (inclusive)
     * @param name  the name of the value for the exception message
     * @throws IllegalArgumentException if the value is out of range
     */
    public static void checkArgRange(int value, int min, int max, String name) {
        if (value < min || value > max) {
            throw new IllegalArgumentException("Argument: " + name + " must be between " + min + " and " + max + ", but was " + value);
        }
    }

}
