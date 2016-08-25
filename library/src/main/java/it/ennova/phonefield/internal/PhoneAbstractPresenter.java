package it.ennova.phonefield.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import it.ennova.phonefield.model.Country;

public interface PhoneAbstractPresenter {

    void updatePhoneWith(@Nullable Country country, @NonNull String phone);
}
