package it.ennova.phonefield.utils;

import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import java.util.Locale;

import it.ennova.phonefield.utils.UserCountryLocalizer;

import static org.junit.Assert.assertEquals;


public class UserCountryLocalizerTest {

    @Test
    public void DeviceLocaleShouldBeTheSameOfTheProvidedOne() throws Exception {
        assertEquals(Locale.getDefault().getLanguage(), UserCountryLocalizer.getDefault(InstrumentationRegistry.getContext()));
    }
}