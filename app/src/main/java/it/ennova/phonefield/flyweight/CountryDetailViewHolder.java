package it.ennova.phonefield.flyweight;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.CountryDetailView;
import it.ennova.phonefield.view.callbacks.OnCountrySelectedListener;

public class CountryDetailViewHolder extends RecyclerView.ViewHolder {
    private final CountryDetailView detailView;

    public CountryDetailViewHolder(@NonNull View itemView, @NonNull OnCountrySelectedListener listener) {
        super(itemView);
        detailView = (CountryDetailView) itemView;
        detailView.setOnCountrySelectedListener(listener);
    }

    public void bindTo(@NonNull Country country) {
        detailView.bindTo(country);
    }
}
