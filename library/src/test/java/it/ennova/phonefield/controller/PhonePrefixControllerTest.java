package it.ennova.phonefield.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import it.ennova.phonefield.controller.PhonePrefixController;
import it.ennova.phonefield.internal.PhoneAbstractPresenter;
import it.ennova.phonefield.internal.PhonePrefixAbstractController;
import it.ennova.phonefield.internal.PrefixAbstractPresenter;

import static it.ennova.phonefield.C.Countries.ITALY;
import static it.ennova.phonefield.C.PhoneNumbers.INVALID_PHONE_NUMBER;
import static it.ennova.phonefield.C.PhoneNumbers.VALID_PHONE_NUMBER;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class PhonePrefixControllerTest {

    @Mock
    PhoneAbstractPresenter phonePresenter;
    @Mock
    PrefixAbstractPresenter prefixPresenter;

    private PhonePrefixAbstractController controller;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller = new PhonePrefixController(phonePresenter, prefixPresenter);
    }

    @Test
    public void WrongPhoneNumberShouldPassNullCountryToPresenter() throws Exception {
        controller.onNumberChanged(INVALID_PHONE_NUMBER);
        verify(phonePresenter, times(1)).updatePhoneWith(null, INVALID_PHONE_NUMBER);
        verify(prefixPresenter, times(1)).updateViewsWith(null);
    }

    @Test
    public void CorrectItalianPhoneNumberShouldPassItalianCountryToPresenters() throws Exception {
        controller.onNumberChanged(VALID_PHONE_NUMBER);
        verify(phonePresenter, times(1)).updatePhoneWith(ITALY, VALID_PHONE_NUMBER);
        verify(prefixPresenter, times(1)).updateViewsWith(ITALY);
    }
}