package com.redbee.academy.clase1;

public class SumaRango {

    /**
     * Generar un algoritmo que sume todos los valores en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolver(Integer num1, Integer num2) {
        Integer suma = 0;
        if (num1 > num2) {
            return 0;
        }
        for (int i = num1; i <= num2; i++) {
            suma = suma + i;
        }
        return suma;
    }


    /**
     * Generar un algoritmo que sume todos los valores enteros PARES que se encuentren en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolverPares(Integer num1, Integer num2) {
        Integer suma = 0;
        if (num1 > num2) {
            return 0;
        }
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }

    /**
     * Generar un algoritmo que sume todos los valores enteros IMPARES que se encuentren en el rango de num1 y num2 inclusives.
     * <p>
     * En caso que num1 > num2, devolver 0.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer resolverImpares(Integer num1, Integer num2) {
        Integer suma = 0;
        if (num1 > num2) {
            return 0;
        }
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 1) {
                suma = suma + i;
            }
        }
        return suma;
    }


}
