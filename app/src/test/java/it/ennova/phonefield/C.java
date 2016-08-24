package it.ennova.phonefield;


import java.util.Arrays;
import java.util.Collection;

import it.ennova.phonefield.model.Countries;
import it.ennova.phonefield.model.Country;

public final class C {

    public static final class Italy {
        public final static String CODE = "it";
        public final static String NAME = "Italy";
        public final static int PREFIX = 39;
    }

    public static final class Countries {
        public static final Country ITALY = Country.create(Italy.CODE, Italy.NAME, Italy.PREFIX);
        public static final Country FIRST = it.ennova.phonefield.model.Countries.LIST.get(1);
        public static final Country FRANCE = Country.create("fr", "France", 33);
    }

    public static final class CountryCodes {
        public static final String ITALY = Italy.CODE;
        public static final String MORDOR = "mb";
    }

    public static final class PhoneNumbers {
        public static final String INVALID_PREFIX = "+80";
        public static final String VALID_PREFIX = "+39";
        public static final String CLEAN_PHONE_NUMBER = "1234567";
        public static final String VALID_PHONE_NUMBER = VALID_PREFIX + CLEAN_PHONE_NUMBER;
        public static final String INVALID_PHONE_NUMBER = INVALID_PREFIX + CLEAN_PHONE_NUMBER;
    }

    public static final class Filter {

        public static final Collection<Object[]> ITALY = Arrays.asList(new Object[][]{
                {null, it.ennova.phonefield.model.Countries.LIST.size()},
                {"", it.ennova.phonefield.model.Countries.LIST.size()},
                {"it", 15}, {"ita", 2}, {"ital", 1}, {"itali", 0}});
    }
}
