package it.ennova.phonefield.model;

import org.junit.Assert;
import org.junit.Test;

import it.ennova.phonefield.R;
import it.ennova.phonefield.model.Country;

import static org.junit.Assert.assertEquals;

public class CountryAndroidTest {

    @Test
    public void countryHoldsCorrectFlag() throws Exception {

        Country country = Country.create("it", "", 1);
        Assert.assertEquals(R.drawable.flag_it, country.resId());
    }
}