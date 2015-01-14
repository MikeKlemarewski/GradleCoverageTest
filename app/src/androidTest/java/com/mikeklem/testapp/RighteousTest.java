package com.mikeklem.testapp;


import junit.framework.TestCase;

public class RighteousTest extends TestCase {

    public void testTagline() {
        String expected = "Righteous Dude!";
        String result = Righteous.tagline();
        assertEquals(expected, result);
    }

}
