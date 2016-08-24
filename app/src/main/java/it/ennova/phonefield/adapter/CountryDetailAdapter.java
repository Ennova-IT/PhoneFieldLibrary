package it.ennova.phonefield.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import it.ennova.phonefield.R;
import it.ennova.phonefield.flyweight.CountryDetailViewHolder;
import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.view.callbacks.OnCountrySelectedListener;


public class CountryDetailAdapter extends RecyclerView.Adapter<CountryDetailViewHolder> {
    private final OnCountrySelectedListener listener;

    public CountryDetailAdapter(@NonNull OnCountrySelectedListener listener) {
        this.listener = listener;
    }

    @Override
    public CountryDetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View holderView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_country_detail, parent, false);
        return new CountryDetailViewHolder(holderView, listener);
    }

    @Override
    public void onBindViewHolder(CountryDetailViewHolder holder, int position) {
        holder.bindTo(Countries.LIST.get(position));
    }

    @Override
    public int getItemCount() {
        return Countries.LIST.size();
    }
}
