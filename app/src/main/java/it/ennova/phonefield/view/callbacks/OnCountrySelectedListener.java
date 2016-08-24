package it.ennova.phonefield.view.callbacks;


import android.support.annotation.NonNull;

import it.ennova.phonefield.model.Country;

public interface OnCountrySelectedListener {
    void onCountrySelected(@NonNull Country country);
}
