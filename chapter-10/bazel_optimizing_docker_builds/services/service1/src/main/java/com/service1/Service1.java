package com.service1;

import com.lib1.Lib1;

public class Service1 {

    private static Lib1 lib1 = new Lib1();

    public String greet(String name) {
        return "Hello, " + name + "! from Service1 at " + lib1.getCurrentTimestamp();
    }
}
