package it.ennova.phonefield.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.graphics.Palette;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import it.ennova.phonefield.R;
import it.ennova.phonefield.internal.PrefixAbstractView;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.callbacks.OnCountrySelectedListener;

public class CountryDetailView extends RelativeLayout implements Palette.PaletteAsyncListener, View.OnClickListener, PrefixAbstractView {
    private Country country = Country.EMPTY;
    private TextView nameView, prefixView;
    private OnCountrySelectedListener listener = null;
    private Drawable background;

    public CountryDetailView(Context context) {
        super(context);
        inflateWith(context);
    }

    private void inflateWith(Context context) {
        inflate(context, R.layout.layout_item_country_detail, this);
        nameView = (TextView) findViewById(R.id.cv_list_name);
        prefixView = (TextView) findViewById(R.id.cv_list_prefix);
        setOnClickListener(this);
        background = DrawableCompat.wrap(getMutatedDrawable(context));
    }

    @NonNull
    private Drawable getMutatedDrawable(Context context) {
        return ContextCompat.getDrawable(context, R.drawable.country_item_round_background).mutate();
    }

    public CountryDetailView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateWith(context);
    }

    public CountryDetailView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateWith(context);
    }

    @Override
    public void bindTo(Country country) {
        this.country = country;
        updateView();
    }

    @Override
    public Country getData() {
        return country;
    }

    private void updateView() {
        nameView.setText(country.name());
        prefixView.setText(country.prefix());

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), country.resId());
        if (bitmap != null && !bitmap.isRecycled()) {
            Palette.from(bitmap).generate(this);
        }
    }

    @Override
    public void onGenerated(Palette palette) {
        DrawableCompat.setTint(background, palette.getDominantColor(0x000000));
        prefixView.setBackground(background);
    }

    @Override
    public void onClick(View view) {
        if (listener != null) {
            listener.onCountrySelected(country);
        }
    }

    public void setOnCountrySelectedListener(OnCountrySelectedListener listener) {
        this.listener = listener;
    }
}
