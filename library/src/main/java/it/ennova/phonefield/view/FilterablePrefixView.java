package it.ennova.phonefield.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import it.ennova.phonefield.R;
import it.ennova.phonefield.adapter.CountryDetailAdapter;
import it.ennova.phonefield.controller.FilteringController;
import it.ennova.phonefield.internal.FilteringAbstractController;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.callbacks.OnCountrySelectedListener;
import it.ennova.phonefield.view.callbacks.OnSearchViewCloseButtonPressedListener;
import it.ennova.phonefield.view.callbacks.SearchViewCallbacks;

public class FilterablePrefixView extends LinearLayout implements OnCountrySelectedListener, SearchView.OnCloseListener {
    private OnCountrySelectedListener listener;
    private OnSearchViewCloseButtonPressedListener closeListener;

    public FilterablePrefixView(Context context) {
        super(context);
        inflateWith(context);
    }

    private void inflateWith(Context context) {
        inflate(context, R.layout.layout_filterable_prefix_list, this);

        CountryDetailAdapter adapter = new CountryDetailAdapter(this);
        FilteringAbstractController controller = new FilteringController(adapter);

        setUpSearchView(controller);
        setUpPrefixView(adapter);
    }

    private void setUpPrefixView(CountryDetailAdapter adapter) {
        GridLayoutManager manager = new GridLayoutManager(getContext(),
                getContext().getResources().getInteger(R.integer.number_of_columns_in_the_prefix_list));

        RecyclerView prefixList = (RecyclerView) findViewById(R.id.countryList);
        prefixList.setLayoutManager(manager);
        prefixList.setAdapter(adapter);
        prefixList.setHasFixedSize(true);
    }

    private void setUpSearchView(FilteringAbstractController controller) {
        SearchView searchView = (SearchView) findViewById(R.id.filteringView);
        searchView.setIconified(false);
        searchView.setOnQueryTextListener(new SearchViewCallbacks.Query(controller));
        searchView.setOnCloseListener(this);
    }

    public FilterablePrefixView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateWith(context);
    }

    public FilterablePrefixView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateWith(context);
    }

    @Override
    public void onCountrySelected(@NonNull Country country) {
        if (listener != null) {
            listener.onCountrySelected(country);
        }
    }

    public void setOnCountrySelectedListener(OnCountrySelectedListener listener) {
        this.listener = listener;
    }

    public void setOnSearchViewCloseButtonPressedListener(OnSearchViewCloseButtonPressedListener closeListener) {
        this.closeListener = closeListener;
    }

    @Override
    public boolean onClose() {
        if (closeListener == null) {
            return false;
        } else {
            closeListener.onCloseButtonPressed();
            return true;
        }
    }
}
