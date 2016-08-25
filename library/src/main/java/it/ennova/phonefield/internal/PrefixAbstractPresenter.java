package it.ennova.phonefield.internal;

import android.support.annotation.Nullable;

import it.ennova.phonefield.model.Country;


public interface PrefixAbstractPresenter {

    void updateViewsWith(@Nullable Country country);
}
