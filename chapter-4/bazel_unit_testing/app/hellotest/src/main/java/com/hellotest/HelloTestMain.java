package com.hellotest;

public class HelloTestMain {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a name as an argument");
            System.exit(1);
        }
        System.out.println(greet(args[0]));
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
