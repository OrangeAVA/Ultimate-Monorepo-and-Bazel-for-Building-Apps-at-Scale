package com.hellotest;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTestMainTest {
    @Test
    public void testGreet() {
        String result = HelloTestMain.greet("World");
        assertEquals("Hello, World!", result);
    }
}
