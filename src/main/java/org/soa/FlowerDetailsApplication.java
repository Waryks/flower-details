package org.soa;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class FlowerDetailsApplication {
    public static void main(String... args) {
        Quarkus.run(args);
    }
}