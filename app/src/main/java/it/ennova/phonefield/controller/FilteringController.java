package it.ennova.phonefield.controller;

import android.support.annotation.Nullable;

import it.ennova.phonefield.internal.FilterableView;
import it.ennova.phonefield.internal.FilteringAbstractController;
import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;

public class FilteringController implements FilteringAbstractController{
    private final FilterableView<Country> filterableView;

    public FilteringController(FilterableView<Country> filterableView) {
        this.filterableView = filterableView;
    }

    @Override
    public void onFilterTyped(@Nullable String filter) {
        filterableView.onFilterApplied(Countries.getFiltered(filter));
    }
}
