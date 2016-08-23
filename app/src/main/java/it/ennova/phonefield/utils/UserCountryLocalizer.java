package it.ennova.phonefield.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.telephony.TelephonyManager;

public class UserCountryLocalizer {

    public static String getDefault(@NonNull Context context) {
        return ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE)).getSimCountryIso();
    }
}
