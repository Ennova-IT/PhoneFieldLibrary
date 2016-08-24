package it.ennova.phonefield.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import it.ennova.phonefield.C;
import it.ennova.phonefield.internal.CompositePrefixPhoneAbstractController;
import it.ennova.phonefield.internal.CompositePrefixPhoneAbstractView;
import it.ennova.phonefield.internal.PhonePrefixAbstractController;
import it.ennova.phonefield.view.callbacks.PhoneNumberChangeListener;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class CompositePrefixPhoneControllerTest {
    @Mock
    CompositePrefixPhoneAbstractView mainView;

    @Mock
    PhonePrefixAbstractController phoneController;

    private CompositePrefixPhoneAbstractController controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller = new CompositePrefixPhoneController(mainView, C.CountryCodes.ITALY, phoneController);
    }

    @Test
    public void loadDefaultsCallsCorrectlyTheMockedObjects() throws Exception {
        controller.loadDefaults();
        verify(mainView).loadDefaultCountry(C.Countries.ITALY);
        verify(mainView).setNumberChangeController(any(PhoneNumberChangeListener.class));
    }
}