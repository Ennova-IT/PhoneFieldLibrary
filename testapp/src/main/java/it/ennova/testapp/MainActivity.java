package it.ennova.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import it.ennova.phonefield.view.CountryNumberView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountryNumberView countryNumberView = ((CountryNumberView) findViewById(R.id.countryNumberView));

        TextView numberTextView = countryNumberView.getAndroidComponent();
    }
}
