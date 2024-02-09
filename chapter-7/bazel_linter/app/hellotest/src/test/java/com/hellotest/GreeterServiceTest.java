package com.hellotest;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreeterServiceTest {
    @Test
    public void testGreet() {
        System.out.println("GreeterServiceTest");
        GreeterService service = new GreeterService();
        String result = service.greet("World");
        assertEquals("Hello, World!", result);
    }
}
