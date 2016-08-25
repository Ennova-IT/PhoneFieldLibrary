package it.ennova.phonefield.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;

import it.ennova.phonefield.R;
import it.ennova.phonefield.internal.CountryPopupAbstractController;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.view.CountryNumberView;
import it.ennova.phonefield.view.FilterablePrefixView;
import it.ennova.phonefield.view.callbacks.OnCountryClickedListener;
import it.ennova.phonefield.view.callbacks.OnCountrySelectedListener;
import it.ennova.phonefield.view.callbacks.OnSearchViewCloseButtonPressedListener;

public class CountryPopupPrefixController implements OnCountrySelectedListener, OnCountryClickedListener,
        CountryPopupAbstractController, OnSearchViewCloseButtonPressedListener {

    private BottomSheetDialog dialog;
    private CountryNumberView view;

    public CountryPopupPrefixController(@NonNull final Context context) {
        View customView = View.inflate(context, R.layout.layout_bottom_sheet_dialog, null);
        setUpFilterableView(customView);
        dialog = new BottomSheetDialog(context);
        dialog.setContentView(customView);
    }

    private void setUpFilterableView(View customView) {
        FilterablePrefixView view = ((FilterablePrefixView) customView.findViewById(R.id.filterablePrefixView));
        view.setOnCountrySelectedListener(this);
        view.setOnSearchViewCloseButtonPressedListener(this);
    }

    @Override
    public void onCountrySelected(@NonNull Country country) {
        dialog.dismiss();
        view.bindTo(country);
    }

    @Override
    public void showPopup() {
        dialog.show();
    }

    @Override
    public void setCompositeView(CountryNumberView view) {
        this.view = view;
        view.setCountryClickedListener(this);
    }


    @Override
    public void onCloseButtonPressed() {
        dialog.dismiss();
    }

    @Override
    public void onCountryClicked(@NonNull Country country) {
        dialog.show();
    }
}
