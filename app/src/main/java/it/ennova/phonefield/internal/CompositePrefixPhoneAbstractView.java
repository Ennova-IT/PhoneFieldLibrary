package it.ennova.phonefield.internal;

import android.support.annotation.NonNull;
import android.text.TextWatcher;

import it.ennova.phonefield.model.Country;

public interface CompositePrefixPhoneAbstractView extends Bindable<Country>{

    void loadDefaultCountry(@NonNull Country country);

    void setNumberChangeController(@NonNull TextWatcher textWatcher);
}
