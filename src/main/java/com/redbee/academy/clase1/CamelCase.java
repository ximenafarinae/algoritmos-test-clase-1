package com.redbee.academy.clase1;

import static java.lang.Character.toUpperCase;

public class CamelCase {


    /**
     * Generar un algoritmo que cuente la cantidad de palabras que hay en un texto teniendo en cuenta que está escrito
     * en notación camelCase.
     * <p>
     * Por ejemplo:
     * hoyVoyAlCine tiene 4 palabras:
     * - hoy
     * - Voy
     * - Al
     * - Cine
     *
     * @param palabra
     * @return
     */
    public static Integer resolver(String texto) {
        Integer aux = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == toUpperCase(texto.charAt(i))) {
                aux += 1;
            }
        }
        return aux + 1;
    }
}
