package it.ennova.phonefield.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;

public class PrefixFinder {

    @Nullable
    public static Country getPrefixFromPhone(@NonNull String phone) {
        for (Country country : Countries.LIST) {
            if (phone.startsWith(country.prefix())) {
                return country;
            }
        }
        return null;
    }
}
