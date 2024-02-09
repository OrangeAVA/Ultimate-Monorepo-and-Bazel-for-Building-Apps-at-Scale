package com.service2;

import com.lib1.Lib1;

public class Service2 {

    private static Lib1 lib1 = new Lib1();

    public String greet(String name) {
        return "Hi, " + name + "! from Service2 at " + lib1.getCurrentTimestamp();
    }
}
