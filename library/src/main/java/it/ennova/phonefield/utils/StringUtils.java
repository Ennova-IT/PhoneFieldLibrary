package it.ennova.phonefield.utils;

import android.support.annotation.Nullable;

public class StringUtils {

    /**
     * Returns true if the string is null or 0-length.
     * @param str the string to be examined
     * @return true if str is null or zero length
     */
    public static boolean isEmpty(@Nullable String str) {
        return str == null || str.length() == 0;
    }
}
