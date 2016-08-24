package it.ennova.phonefield;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.utils.UserCountryLocalizer;
import it.ennova.phonefield.view.CountryView;

public class MainActivity extends AppCompatActivity implements CountryView.OnCountryClickedListener {

    private CountryView countryView;
    private Random random = new Random();
    private final int SEED = Countries.LIST.size();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private Country getCountry() {
        return Countries.LIST.get(random.nextInt(SEED));
    }

    @Override
    public void onCountryClicked(@NonNull Country country) {
        countryView.bindTo(getCountry());
    }
}
