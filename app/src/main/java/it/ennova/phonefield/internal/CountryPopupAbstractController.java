package it.ennova.phonefield.internal;


public interface CountryPopupAbstractController<T> {

    void showPopup();
    CountryPopupAbstractController<T> setBindableView(Bindable<T> view);
}
