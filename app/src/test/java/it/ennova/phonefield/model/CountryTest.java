package it.ennova.phonefield.model;

import org.junit.Test;

import java.util.Locale;

import it.ennova.phonefield.C;
import it.ennova.phonefield.model.Country;

import static it.ennova.phonefield.C.Italy.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CountryTest {

    private Country expected = C.Countries.ITALY;


    @Test
    public void countryHasCorrectCode() throws Exception {
        assertEquals(CODE, expected.code());
    }

    @Test
    public void countryHasCorrectName() throws Exception {
        assertEquals(NAME, expected.name());
    }

    @Test
    public void countryHasCorrectPrefix() throws Exception {
        String PREFIX_AS_STRING = "+" + PREFIX;
        assertEquals(PREFIX_AS_STRING, expected.prefix());
    }

    @Test
    public void countryCreatedTwiceIsEqualToItself() throws Exception {
        Country actual = Country.create(CODE, NAME, PREFIX);
        assertEquals(expected, actual);
    }

    @Test
    public void countryShouldBeAbleToCheckIfIsTheSameOfTheSystemLocale() throws Exception {
        String code = Locale.getDefault().getLanguage();
        Country actual = Country.create(code, Locale.getDefault().getCountry(), 0);
        assertTrue(actual.is(code));
    }

    @Test
    public void countryShouldBeAbleToTellIfIsNotTheSameOfTheGivenLocale() throws Exception {
        Country actual = Country.create(CODE, NAME, PREFIX);
        assertFalse(actual.is("en"));
    }
}