package it.ennova.phonefield.view.callbacks;

import android.support.annotation.NonNull;

import it.ennova.phonefield.model.Country;

public interface OnCountryClickedListener {
    void onCountryClicked(@NonNull Country country);
}
