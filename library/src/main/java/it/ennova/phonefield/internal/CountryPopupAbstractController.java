package it.ennova.phonefield.internal;


import android.view.View;

import it.ennova.phonefield.view.CountryNumberView;

public interface CountryPopupAbstractController {

    void showPopup();
    void setCompositeView(CountryNumberView view);
}
