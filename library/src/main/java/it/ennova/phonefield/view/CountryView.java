package it.ennova.phonefield.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import it.ennova.phonefield.R;
import it.ennova.phonefield.internal.PrefixAbstractView;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.callbacks.OnCountryClickedListener;

public class CountryView extends LinearLayout implements View.OnClickListener, PrefixAbstractView {
    private ImageView flagView;
    private TextView prefixView;
    private Country country;
    private OnCountryClickedListener listener = null;

    public CountryView(Context context) {
        super(context);
        inflateWith(context);
    }

    private void inflateWith(Context context) {
        inflate(context, R.layout.layout_item_country, this);
        flagView = (ImageView) findViewById(R.id.list_flag);
        prefixView = (TextView) findViewById(R.id.list_prefix);
        setOnClickListener(this);
    }

    public CountryView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateWith(context);
    }

    public CountryView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateWith(context);
    }

    @Override
    public void bindTo(Country country) {
        this.country = country;
        flagView.setImageResource(country.resId());
        prefixView.setText(country.prefix());
    }

    @Override
    public Country getData() {
        return country;
    }

    @Override
    public void onClick(View view) {
        if (listener != null) {
            listener.onCountryClicked(country);
        }
    }

    public CountryView setOnCountryClickedListener(OnCountryClickedListener listener) {
        this.listener = listener;
        return this;
    }
}
