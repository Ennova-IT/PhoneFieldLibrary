package it.ennova.phonefield.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import it.ennova.phonefield.C;
import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
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

    @Parameterized.Parameters(name = "FilterWith{0}ShouldReturnAListOf{1}Elements")
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                {null, Countries.LIST.size()}, {"", Countries.LIST.size()}, {"it", 15},
                {"ita", 2}, {"ital", 1}, {"itali", 0}
        });
    }

    @SuppressWarnings("WeakerAccess")
    @Parameterized.Parameter
    public String filter;

    @SuppressWarnings("WeakerAccess")
    @Parameterized.Parameter(value = 1)
    public int size;

    @Test
    public void filteredList() throws Exception {
        assertEquals(size, Countries.getFiltered(filter).size());
    }
}