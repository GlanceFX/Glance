package com.glance.common.exception;

/**
 * Exception thrown when reflection fails to resolve a field or method.
 */
public class ReflectionException extends RuntimeException {

    /**
     * Constructs a new ReflectionException with the specified message.
     *
     * @param message The detail message.
     */
    public ReflectionException(String message) {
        super(message);
    }

    /**
     * Constructs a new ReflectionException with the specified message and cause.
     *
     * @param message The detail message.
     * @param cause   The cause of this exception.
     */
    public ReflectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
