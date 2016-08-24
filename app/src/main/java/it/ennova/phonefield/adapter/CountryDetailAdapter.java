package it.ennova.phonefield.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import it.ennova.phonefield.R;
import it.ennova.phonefield.flyweight.CountryDetailViewHolder;
import it.ennova.phonefield.internal.FilterableView;
import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.callbacks.OnCountrySelectedListener;


public class CountryDetailAdapter extends RecyclerView.Adapter<CountryDetailViewHolder> implements FilterableView<Country>{
    private final OnCountrySelectedListener listener;
    private List<Country> dataSet = new ArrayList<>(Countries.LIST.size());

    public CountryDetailAdapter(@NonNull OnCountrySelectedListener listener) {
        this.listener = listener;
        dataSet.addAll(Countries.LIST);
    }

    @Override
    public CountryDetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View holderView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_country_detail, parent, false);
        return new CountryDetailViewHolder(holderView, listener);
    }

    @Override
    public void onBindViewHolder(CountryDetailViewHolder holder, int position) {
        holder.bindTo(dataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    @Override
    public void onFilterApplied(List<Country> data) {
        dataSet.clear();
        dataSet.addAll(data);
        notifyDataSetChanged();
    }
}
