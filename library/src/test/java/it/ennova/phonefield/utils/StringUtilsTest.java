package it.ennova.phonefield.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("WeakerAccess")
@RunWith(Parameterized.class)
public class StringUtilsTest {

    @Parameterized.Parameters(name = "isEmptyWith({1})ShouldReturn{0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, null}, {true, ""}, {false, "a"}, {false, "ab"}, {false, "abc"}, {false, "abcd"},
                {false, "abcde"}, {false, "abcdef"}, {false, "qwertyuiop"}, {false, "asdfghjkl"}
        });
    }

    @Parameterized.Parameter
    public boolean expected;

    @Parameterized.Parameter(value = 1)
    public String current;

    @Test
    public void testStringReturningValues() throws Exception {
        assertEquals(expected, StringUtils.isEmpty(current));

    }
}