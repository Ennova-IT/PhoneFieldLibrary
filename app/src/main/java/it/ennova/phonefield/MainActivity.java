package it.ennova.phonefield;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import it.ennova.phonefield.controller.CountryPopupPrefixController;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.CountryNumberView;
import it.ennova.phonefield.view.callbacks.OnCountryClickedListener;
import it.ennova.phonefield.view.callbacks.OnCountrySelectedListener;

public class MainActivity extends AppCompatActivity implements OnCountryClickedListener {

    private CountryPopupPrefixController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountryNumberView countryNumberView = ((CountryNumberView) findViewById(R.id.countryNumberView));
        countryNumberView.setCountryClickedListener(this);
        controller = (CountryPopupPrefixController) new CountryPopupPrefixController(this).setBindableView(countryNumberView);
    }

    @Override
    public void onCountryClicked(@NonNull Country country) {
        controller.showPopup();
    }
}
