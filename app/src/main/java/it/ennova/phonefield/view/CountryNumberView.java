package it.ennova.phonefield.view;


import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import it.ennova.phonefield.R;
import it.ennova.phonefield.controller.CompositePrefixPhoneController;
import it.ennova.phonefield.controller.PhonePrefixController;
import it.ennova.phonefield.internal.CompositePrefixPhoneAbstractController;
import it.ennova.phonefield.internal.CompositePrefixPhoneAbstractView;
import it.ennova.phonefield.internal.PhoneAbstractPresenter;
import it.ennova.phonefield.internal.PhonePrefixAbstractController;
import it.ennova.phonefield.internal.PrefixAbstractPresenter;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.presenter.PhonePresenter;
import it.ennova.phonefield.presenter.PrefixPresenter;
import it.ennova.phonefield.utils.UserCountryLocalizer;
import it.ennova.phonefield.view.callbacks.OnCountryClickedListener;

public class CountryNumberView extends LinearLayout implements CompositePrefixPhoneAbstractView{
    private CountryView countryView;
    private CountryPhoneView phoneView;

    public CountryNumberView(Context context) {
        super(context);
        inflateWith(context);
    }

    private void inflateWith(Context context) {
        inflate(context, R.layout.layout_number_view, this);
        countryView = (CountryView) findViewById(R.id.countryView);
        phoneView = (CountryPhoneView) findViewById(R.id.phoneView);
        initController();
    }

    private void initController() {
        PhoneAbstractPresenter phonePresenter = new PhonePresenter(phoneView);
        PrefixAbstractPresenter prefixPresenter = new PrefixPresenter(countryView);
        PhonePrefixAbstractController phonePrefixController = new PhonePrefixController(phonePresenter, prefixPresenter);
        CompositePrefixPhoneAbstractController controller = new CompositePrefixPhoneController(this, UserCountryLocalizer.getDefault(getContext()), phonePrefixController);
        controller.loadDefaults();
    }

    public CountryNumberView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateWith(context);
    }

    public CountryNumberView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateWith(context);
    }

    @Override
    public void loadDefaultCountry(@NonNull Country country) {
        countryView.bindTo(country);
    }

    @Override
    public void setNumberChangeController(@NonNull TextWatcher textWatcher) {
        phoneView.setCallback(textWatcher);
    }

    @Override
    public void bindTo(Country country) {
        countryView.bindTo(country);
    }

    @Override
    public Country getData() {
        return countryView.getData();
    }

    public void setCountryClickedListener(OnCountryClickedListener listener) {
        countryView.setOnCountryClickedListener(listener);
    }
}
