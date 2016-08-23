package it.ennova.phonefield.presenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import it.ennova.phonefield.internal.PhoneAbstractPresenter;
import it.ennova.phonefield.internal.PhoneAbstractView;
import it.ennova.phonefield.presenter.PhonePresenter;

import static it.ennova.phonefield.C.Countries.*;
import static it.ennova.phonefield.C.PhoneNumbers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

public class PhonePresenterTest {
    @Mock
    PhoneAbstractView phoneView;

    private PhoneAbstractPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter = new PhonePresenter(phoneView);
    }

    @Test
    public void nullCountryShouldNeverTriggerView() throws Exception {
        presenter.updatePhoneWith(null, "");
        Mockito.verify(phoneView, never()).updatePhoneNumber(any(String.class));

        presenter.updatePhoneWith(null, VALID_PHONE_NUMBER);
        Mockito.verify(phoneView, never()).updatePhoneNumber(any(String.class));
    }

    @Test
    public void CountryWithSamePrefixShouldCleanTheNumber() throws Exception {
        presenter.updatePhoneWith(ITALY, VALID_PHONE_NUMBER);
        Mockito.verify(phoneView, times(1)).updatePhoneNumber(CLEAN_PHONE_NUMBER);
    }

    @Test
    public void CountryWithAnotherPrefixShouldNotCleanTheNumber() throws Exception {
        presenter.updatePhoneWith(FRANCE, VALID_PHONE_NUMBER);
        Mockito.verify(phoneView, never()).updatePhoneNumber(any(String.class));
    }
}