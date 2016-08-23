package it.ennova.phonefield.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import it.ennova.phonefield.internal.PhoneAbstractPresenter;
import it.ennova.phonefield.internal.PhoneAbstractView;
import it.ennova.phonefield.model.Country;

public class PhonePresenter implements PhoneAbstractPresenter {
    private final PhoneAbstractView phoneView;

    public PhonePresenter(PhoneAbstractView phoneView) {
        this.phoneView = phoneView;
    }

    @Override
    public void updatePhoneWith(@Nullable Country country, @NonNull String phone) {
        if (country != null && phone.startsWith(country.prefix())) {
            phoneView.updatePhoneNumber(phone.substring(country.prefix().length()));
        }
    }
}
