package it.ennova.phonefield.view.callbacks;

import android.text.Editable;
import android.text.TextWatcher;

import it.ennova.phonefield.internal.PhonePrefixAbstractController;


public class PhoneNumberChangeListener implements TextWatcher {
    private static final int THRESHOLD = 4;
    private static final int MINIMUM_START_VALUE = 2;

    private final PhonePrefixAbstractController controller;

    public PhoneNumberChangeListener(PhonePrefixAbstractController controller) {
        this.controller = controller;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
        if (charSequence.length() > THRESHOLD && start >= MINIMUM_START_VALUE) {
            controller.onNumberChanged(charSequence.toString());
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
