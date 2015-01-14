package com.mikeklem.testapp;

import junit.framework.TestCase;

public class NotRighteousTest extends TestCase {
    public void testTagline() {
        String expected = "Dude! So not righteous!";
        String result = NotRighteous.tagline();
        assertEquals(expected, result);
    }
}
