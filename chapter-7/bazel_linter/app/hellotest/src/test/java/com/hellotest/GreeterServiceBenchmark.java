package com.hellotest;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class GreeterServiceBenchmark {

    @Param({"Alice", "Bob", "Charlie", "Diana"})
    public String name;

    private final GreeterService greeterService = new GreeterService();

    @Benchmark
    public void greetBenchmark() {
        greeterService.greet(name);
    }
}

