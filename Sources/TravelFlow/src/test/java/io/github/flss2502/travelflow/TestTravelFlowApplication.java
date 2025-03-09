package io.github.flss2502.travelflow;

import org.springframework.boot.SpringApplication;

public class TestTravelFlowApplication {

    public static void main(String[] args) {
        SpringApplication.from(TravelFlowApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
