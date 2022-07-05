package com.example.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleApplicationTests {

    @Test
    void contextLoads() {
        assertThat(1).isEqualTo(1);
    }

}
