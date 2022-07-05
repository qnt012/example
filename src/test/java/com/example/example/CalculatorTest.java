package com.example.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void test() {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(1,2)).isEqualTo(3);
    }

}