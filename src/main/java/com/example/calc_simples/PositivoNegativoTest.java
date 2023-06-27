package com.example.calc_simples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositivoNegativoTest {

    @Test
    void avalia() {
        String resultado = PositivoNegativo.avalia(5.0);
        Assertions.assertEquals("Positivo", resultado);
    }
}