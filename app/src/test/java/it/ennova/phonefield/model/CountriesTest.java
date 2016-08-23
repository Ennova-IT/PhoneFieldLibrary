package it.ennova.phonefield.model;

import org.junit.Test;

import it.ennova.phonefield.C;
import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;

import static org.junit.Assert.*;

public class CountriesTest {

    @Test
    public void searchingItalyGetsTheCorrectCountry() throws Exception {
        Country actual = Countries.get(C.CountryCodes.ITALY);
        Country expected = C.Countries.ITALY;

        assertEquals(expected, actual);
    }

    @Test
    public void searchingMordorGivesFirstCountry() throws Exception {
        Country actual = Countries.get(C.CountryCodes.MORDOR);
        Country expected = C.Countries.FIRST;

        assertEquals(expected, actual);
    }
}