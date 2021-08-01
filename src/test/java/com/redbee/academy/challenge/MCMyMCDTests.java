package com.redbee.academy.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MCMyMCDTests {

    @Test
    @DisplayName("Test mínimo común múltiplo")
    void testMcm() {
        Integer resultado = MCMyMCD.mcm(6, 9);

        Assertions.assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Test máximo común divisor")
    void testMcd() {
        Integer resultado = MCMyMCD.mcd(14, 22);

        Assertions.assertEquals(2, resultado);
    }
}
