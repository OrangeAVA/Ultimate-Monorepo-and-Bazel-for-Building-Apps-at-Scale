package com.hellotest;

public class HelloTestMain {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a name as an argument");
            return;
        }
        GreeterService service = new GreeterService();
        System.out.println(service.greet(args[0]));
    }

}
