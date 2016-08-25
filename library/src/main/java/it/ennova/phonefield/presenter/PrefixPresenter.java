package it.ennova.phonefield.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import it.ennova.phonefield.internal.PrefixAbstractPresenter;
import it.ennova.phonefield.internal.PrefixAbstractView;
import it.ennova.phonefield.model.Country;

public class PrefixPresenter implements PrefixAbstractPresenter {
    private final PrefixAbstractView prefixView;

    public PrefixPresenter(@NonNull PrefixAbstractView prefixView) {
        this.prefixView = prefixView;
    }

    @Override
    public void updateViewsWith(@Nullable Country country) {
        if (country != null && !prefixView.getData().is(country.code())) {
            prefixView.bindTo(country);
        }
    }
}
