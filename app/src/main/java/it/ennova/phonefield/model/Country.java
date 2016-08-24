package it.ennova.phonefield.model;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;

import com.google.auto.value.AutoValue;

import it.ennova.phonefield.R;

@AutoValue
public abstract class Country {
    public abstract String code();
    public abstract String name();
    public abstract String prefix();
    @DrawableRes
    public abstract int resId();

    public static final Country EMPTY = create("", "", 0);

    public static Country create(@NonNull String code, @NonNull String name, int prefix) {
        return new AutoValue_Country(code, name, "+" + prefix, buildResIdFrom(code));
    }

    private static int buildResIdFrom(@NonNull String code) {
        String name = String.format("flag_%s", code.toLowerCase());
        try {
            return R.drawable.class.getField(name).getInt(null);
        } catch (Exception e) {
            return 0;
        }
    }

    public boolean is(@NonNull String countryCode) {
        return code().equalsIgnoreCase(countryCode);
    }

    boolean matches(@NonNull String filter) {
        return name().toLowerCase().contains(filter.toLowerCase());
    }
}
