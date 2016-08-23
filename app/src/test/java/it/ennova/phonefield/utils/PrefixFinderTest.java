package it.ennova.phonefield.utils;

import org.junit.Test;

import it.ennova.phonefield.model.Country;
import it.ennova.phonefield.utils.PrefixFinder;

import static it.ennova.phonefield.C.Countries.ITALY;
import static it.ennova.phonefield.C.PhoneNumbers.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class PrefixFinderTest {

    @Test
    public void CountryNotFoundShouldReturnNull() throws Exception {
        Country country = PrefixFinder.getPrefixFromPhone(INVALID_PREFIX + CLEAN_PHONE_NUMBER);
        assertNull(country);
    }

    @Test
    public void ValidCountryShouldReturnNonNull() throws Exception {
        Country country = PrefixFinder.getPrefixFromPhone(VALID_PREFIX + CLEAN_PHONE_NUMBER);
        assertEquals(ITALY, country);
    }
}