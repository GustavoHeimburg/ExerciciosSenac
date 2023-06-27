package com.example.calc_simples;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class calculadoraTest {

    @org.junit.jupiter.api.Test
    void soma() {
        int resultado = calculadora.soma(3,3);
        Assertions.assertEquals(6, resultado);

    }
    @org.junit.jupiter.api.Test
    void subtracao() {
        int resultado = calculadora.subtracao(10,8);
        Assertions.assertEquals(2, resultado);
    }
    @org.junit.jupiter.api.Test
    void divisao() {
        int resultado = calculadora.divisao(4,2);
        Assertions.assertEquals(2, resultado);
    }
    @org.junit.jupiter.api.Test
    void multiplicacao() {
        int resultado = calculadora.multiplicacao(5,5);
        Assertions.assertEquals(25, resultado);
    }
}