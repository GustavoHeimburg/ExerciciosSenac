package com.example.calc_simples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {

    @Test
    void validaPar() {
        boolean validacao = ParImpar.validaPar(2);
        Assertions.assertTrue(validacao);
    }
}