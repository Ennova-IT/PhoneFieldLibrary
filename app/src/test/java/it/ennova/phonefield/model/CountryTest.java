package it.ennova.phonefield.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

import it.ennova.phonefield.C;
import it.ennova.phonefield.model.Country;

import static it.ennova.phonefield.C.Italy.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

@RunWith(Parameterized.class)
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

    @Parameterized.Parameters(name = "{0}Matches({1})ShouldReturn{2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {C.Countries.ITALY, "i", true}, {C.Countries.ITALY, "it", true}, {C.Countries.ITALY, "ita", true}, {C.Countries.ITALY, "ital", true},
                {C.Countries.ITALY, "italy", true}, {C.Countries.ITALY, "italia", false}, {C.Countries.ITALY, "f", false}, {C.Countries.ITALY, "t", true},
                {C.Countries.ITALY, "ta", true}, {C.Countries.ITALY, "tal", true}, {C.Countries.ITALY, "taly", true}, {C.Countries.ITALY, "aly", true},
                {C.Countries.ITALY, "al", true}, {C.Countries.ITALY, "ly", true}, {C.Countries.ITALY, "fr", false}, {C.Countries.ITALY, "fra", false}
        });
    }

    @SuppressWarnings("WeakerAccess")
    @Parameterized.Parameter
    public Country currentCountry;

    @SuppressWarnings("WeakerAccess")
    @Parameterized.Parameter(value = 1)
    public String filter;

    @SuppressWarnings("WeakerAccess")
    @Parameterized.Parameter(value = 2)
    public boolean expectedResult;

    @Test
    public void CountryFilterParametrizedTest() throws Exception {
        assertEquals(expectedResult, currentCountry.matches(filter));
    }
}