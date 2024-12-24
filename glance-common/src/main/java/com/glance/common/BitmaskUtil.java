package com.glance.common;

public final class BitmaskUtil {

    private BitmaskUtil() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Updates a bitmask by enabling or disabling a specific flag.
     *
     * @param bitmask The current bitmask.
     * @param flag The flag to enable or disable.
     * @param enable Whether to enable (true) or disable (false) the flag.
     * @return The updated bitmask.
     */
    public static int setFlag(int bitmask, int flag, boolean enable) {
        return enable ? (bitmask | flag) : (bitmask & ~flag);
    }

    /**
     * Checks if a specific flag is enabled in the bitmask.
     *
     * @param bitmask The bitmask to check.
     * @param flag The flag to check.
     * @return True if the flag is enabled, false otherwise.
     */
    public static boolean hasFlag(int bitmask, int flag) {
        return (bitmask & flag) != 0;
    }

}
