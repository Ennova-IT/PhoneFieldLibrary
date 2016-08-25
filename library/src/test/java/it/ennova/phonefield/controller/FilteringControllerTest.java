package it.ennova.phonefield.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.ArgumentMatcher;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Collection;
import java.util.List;

import it.ennova.phonefield.C;
import it.ennova.phonefield.internal.FilterableView;
import it.ennova.phonefield.model.Country;

import static org.mockito.ArgumentMatchers.argThat;

@RunWith(Parameterized.class)
public class FilteringControllerTest {

    @Mock
    FilterableView<Country> mockedView;

    private FilteringController controller;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller = new FilteringController(mockedView);
    }

    @Parameterized.Parameters(name = "FilterWith{0}ShouldPassTheViewAListOf{1}Elements")
    public static Collection<Object[]> params() {
        return C.Filter.ITALY;
    }

    @SuppressWarnings("WeakerAccess")
    @Parameterized.Parameter
    public String filter;
    @SuppressWarnings("WeakerAccess")
    @Parameterized.Parameter(value = 1)
    public int number;

    @Test
    public void checkFilteringMethods() throws Exception {
        controller.onFilterTyped(filter);
        Mockito.verify(mockedView).onFilterApplied(argThat(new isSizedListOfCountry(number)));
    }

    private class isSizedListOfCountry implements ArgumentMatcher<List<Country>> {
        private final int number;

        isSizedListOfCountry(int number) {
            this.number = number;
        }

        @Override
        public boolean matches(List<Country> argument) {
            return argument.size() == number;
        }
    }
}