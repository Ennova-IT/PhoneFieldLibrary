package it.ennova.phonefield;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.CountryNumberView;
import it.ennova.phonefield.view.callbacks.OnCountryClickedListener;

public class MainActivity extends AppCompatActivity implements OnCountryClickedListener {

    private CountryNumberView countryView;
    private Random random = new Random();
    private final int SEED = Countries.LIST.size();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryView = (CountryNumberView) findViewById(R.id.countryNumberView);
        countryView.setCountryClickedListener(this);

    }

    private Country getCountry() {
        return Countries.LIST.get(random.nextInt(SEED));
    }

    @Override
    public void onCountryClicked(@NonNull Country country) {
        countryView.bindTo(getCountry());
    }
}
