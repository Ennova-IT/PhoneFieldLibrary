package it.ennova.phonefield.controller;

import android.support.annotation.NonNull;
import android.text.TextWatcher;

import it.ennova.phonefield.internal.CompositePrefixPhoneAbstractController;
import it.ennova.phonefield.internal.CompositePrefixPhoneAbstractView;
import it.ennova.phonefield.internal.PhonePrefixAbstractController;
import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.callbacks.PhoneNumberChangeListener;

public class CompositePrefixPhoneController implements CompositePrefixPhoneAbstractController {
    private final CompositePrefixPhoneAbstractView mainView;
    private final Country country;
    private final TextWatcher textWatcher;

    public CompositePrefixPhoneController(@NonNull CompositePrefixPhoneAbstractView mainView, @NonNull String defaultLocale,
                                          @NonNull PhonePrefixAbstractController prefixPhoneController) {
        this.mainView = mainView;
        country = Countries.get(defaultLocale);
        textWatcher = new PhoneNumberChangeListener(prefixPhoneController);
    }

    @Override
    public void loadDefaults() {
        mainView.loadDefaultCountry(country);
        mainView.setNumberChangeController(textWatcher);
    }
}
