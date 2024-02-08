package com.hellotest;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTestMainTest {
    @Test
    public void testGreet() {
        System.out.println("HelloTestMainTest");
        HelloTestMain.main(new String[]{"World"});
    }

    @Test
    public void testEmptyGreet() {
        System.out.println("HelloTestMainTest");
        HelloTestMain.main(new String[]{});
    }

    @Test
    public void testInstance() {
        System.out.println("HelloTestMainTest");
        HelloTestMain main = new HelloTestMain();
    }

}
