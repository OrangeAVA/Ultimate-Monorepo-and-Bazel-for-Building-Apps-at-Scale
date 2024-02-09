package com.service1;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a name as an argument");
            return;
        }
        Service1 service = new Service1();
        System.out.println(service.greet(args[0]));
    }

}
