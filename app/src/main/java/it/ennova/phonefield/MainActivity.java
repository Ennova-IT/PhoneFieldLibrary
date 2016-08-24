package it.ennova.phonefield;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.Random;

import it.ennova.phonefield.adapter.CountryDetailAdapter;
import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.CountryNumberView;
import it.ennova.phonefield.view.callbacks.OnCountryClickedListener;
import it.ennova.phonefield.view.callbacks.OnCountrySelectedListener;

public class MainActivity extends AppCompatActivity implements OnCountryClickedListener, OnCountrySelectedListener {

//    private CountryNumberView countryView;
//    private Random random = new Random();
//    private final int SEED = Countries.LIST.size();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        countryView = (CountryNumberView) findViewById(R.id.countryNumberView);
//        countryView.setCountryClickedListener(this);

        RecyclerView list = (RecyclerView) findViewById(R.id.countryList);
        GridLayoutManager manager = new GridLayoutManager(this, 3);
        list.setLayoutManager(manager);
        list.setAdapter(new CountryDetailAdapter(this));
        list.setHasFixedSize(true);

    }

//    private Country getCountry() {
//        return Countries.LIST.get(random.nextInt(SEED));
//    }

    @Override
    public void onCountryClicked(@NonNull Country country) {
//        countryView.bindTo(getCountry());
    }

    @Override
    public void onCountrySelected(@NonNull Country country) {
        Log.d("TAG", country.toString());
    }
}
