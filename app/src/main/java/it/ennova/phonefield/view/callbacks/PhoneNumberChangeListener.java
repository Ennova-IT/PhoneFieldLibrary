package it.ennova.phonefield.view.callbacks;

import android.text.Editable;
import android.text.TextWatcher;

import it.ennova.phonefield.internal.PhonePrefixAbstractController;


public class PhoneNumberChangeListener implements TextWatcher {
    private static final int THRESHOLD = 3;
    private final PhonePrefixAbstractController controller;

    public PhoneNumberChangeListener(PhonePrefixAbstractController controller) {
        this.controller = controller;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if (charSequence.length() > THRESHOLD) {
            controller.onNumberChanged(charSequence.toString());
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
