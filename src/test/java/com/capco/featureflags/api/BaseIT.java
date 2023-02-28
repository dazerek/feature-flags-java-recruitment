package com.capco.featureflags.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(PostgresExtension.class)
public abstract class BaseIT {

    @Test
    void contextLoads() {
        assert (true);
    }
}
