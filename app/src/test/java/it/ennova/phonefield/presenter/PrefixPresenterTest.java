package it.ennova.phonefield.presenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import it.ennova.phonefield.internal.PrefixAbstractPresenter;
import it.ennova.phonefield.internal.PrefixAbstractView;
import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.presenter.PrefixPresenter;

import static it.ennova.phonefield.C.Countries.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PrefixPresenterTest {

    @Mock
    PrefixAbstractView mockedView;

    private PrefixAbstractPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(mockedView.getData()).thenReturn(ITALY);

        presenter = new PrefixPresenter(mockedView);
    }

    @Test
    public void NullCountryShouldNotTriggerPrefixView() throws Exception {
        presenter.updateViewsWith(null);
        verify(mockedView, never()).bindTo(any(Country.class));
    }

    @Test
    public void SameCountryShouldNotTriggerPrefixView() throws Exception {
        presenter.updateViewsWith(ITALY);
        verify(mockedView, never()).bindTo(any(Country.class));
    }

    @Test
    public void DifferentCountryShouldTriggerPrefixViewUpdate() throws Exception {
        presenter.updateViewsWith(FRANCE);
        verify(mockedView, times(1)).bindTo(FRANCE);
    }
}