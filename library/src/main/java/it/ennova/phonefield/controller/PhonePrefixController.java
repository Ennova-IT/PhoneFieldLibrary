package it.ennova.phonefield.controller;

import android.support.annotation.NonNull;

import it.ennova.phonefield.utils.PrefixFinder;
import it.ennova.phonefield.internal.PhoneAbstractPresenter;
import it.ennova.phonefield.internal.PhonePrefixAbstractController;
import it.ennova.phonefield.internal.PrefixAbstractPresenter;
import it.ennova.phonefield.model.Country;


public class PhonePrefixController implements PhonePrefixAbstractController {
    private final PhoneAbstractPresenter phonePresenter;
    private final PrefixAbstractPresenter prefixPresenter;

    public PhonePrefixController(@NonNull PhoneAbstractPresenter phonePresenter,
                                 @NonNull PrefixAbstractPresenter prefixPresenter) {

        this.phonePresenter = phonePresenter;
        this.prefixPresenter = prefixPresenter;
    }

    @Override
    public void onNumberChanged(@NonNull String phone) {
        Country country = PrefixFinder.getPrefixFromPhone(phone);
        phonePresenter.updatePhoneWith(country, phone);
        prefixPresenter.updateViewsWith(country);
    }
}
