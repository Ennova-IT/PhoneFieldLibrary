package it.ennova.phonefield.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import it.ennova.phonefield.R;
import it.ennova.phonefield.internal.PhoneAbstractView;


public class CountryPhoneView extends LinearLayout implements PhoneAbstractView{
    private TextInputEditText phoneView;

    public CountryPhoneView(Context context) {
        super(context);
        inflateWith(context);
    }

    private void inflateWith(Context context) {
        inflate(context, R.layout.layout_item_phone_number, this);
        phoneView = (TextInputEditText) findViewById(R.id.cv_phone_number);
    }

    public CountryPhoneView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateWith(context);
    }

    public CountryPhoneView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflateWith(context);
    }

    @Override
    public void updatePhoneNumber(@NonNull String phone) {
        phoneView.setText(phone);
        phoneView.setSelection(phone.length());
    }

    public void setCallback(@NonNull TextWatcher textWatcher) {
        phoneView.addTextChangedListener(textWatcher);
    }
}
