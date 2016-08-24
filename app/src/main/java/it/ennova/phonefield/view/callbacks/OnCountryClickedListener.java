package it.ennova.phonefield.view.callbacks;

import android.support.annotation.NonNull;

import it.ennova.phonefield.model.Country;

/**
 * Created by tiwiz on 24/08/16.
 */
public interface OnCountryClickedListener {
    void onCountryClicked(@NonNull Country country);
}
