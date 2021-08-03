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
        Integer aux=0;
        //TODO: implementar
        for (int i = 0; i < texto.length(); i++) {
          if(Character.valueOf(texto.charAt(i)).compareTo(Character.valueOf(toUpperCase(texto.charAt(i)))) == 0){
              aux +=1;
          }
        }
        return aux+1;
    }



}
