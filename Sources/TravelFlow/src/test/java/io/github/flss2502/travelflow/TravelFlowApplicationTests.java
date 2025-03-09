package io.github.flss2502.travelflow;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class TravelFlowApplicationTests {

    @Test
    void contextLoads() {
    }

}
