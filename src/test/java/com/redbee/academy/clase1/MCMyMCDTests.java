package com.redbee.academy.clase1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MCMyMCDTests {

    @Test
    @DisplayName("Test mínimo común múltiplo")
    void testMcm() {
        Integer resultado = MCMyMCD.mcm(6, 9);

        Assertions.assertEquals(18, resultado);
    }
    @Test
    @DisplayName("Test mínimo común múltiplo")
    void testMcm1() {
        Integer resultado = MCMyMCD.mcm(6, 4);

        Assertions.assertEquals(12, resultado);
    }

    @Test
    @DisplayName("Test máximo común divisor")
    void testMcd() {
        Integer resultado = MCMyMCD.mcd(14, 22);

        Assertions.assertEquals(2, resultado);
    }
}
