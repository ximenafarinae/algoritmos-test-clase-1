package com.redbee.academy.clase1;

public class Potencia {

    /**
     * Generar un algoritmo para elevar un número (base) a una potencia dada
     *
     * @param base
     * @param potencia
     * @return
     */
    public static Integer resolver(Integer base, Integer potencia) {
        Integer acum = 1;
        for (int i = 0; i < potencia; i++) {
            acum = acum * base;
        }
        return acum;
    }
}
