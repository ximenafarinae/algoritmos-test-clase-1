package com.redbee.academy.clase1;

public class MCMyMCD {


    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        int res = (a / mcd(num1, num2)) * b;

        return res;
    }

    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        int res = 0;
        do {
            res= b;
            b = a % b;
            a = res;
        } while (b != 0);

        return res;
    }
}
