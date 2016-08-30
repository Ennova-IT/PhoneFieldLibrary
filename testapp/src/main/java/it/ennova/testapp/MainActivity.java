package it.ennova.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import it.ennova.phonefield.view.CountryNumberView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CountryNumberView countryNumberView = ((CountryNumberView) findViewById(R.id.countryNumberView));

        final TextView numberTextView = countryNumberView.getAndroidComponent();
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        findViewById(R.id.getNumberButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(countryNumberView.getComposedNumber());
            }
        });
    }
}
