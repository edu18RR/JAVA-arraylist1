package com.alura;

import java.util.ArrayList;

public class Clase1 {

    public static void main(String[] args) { //string retorna un string de una coleccion

        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";

        ArrayList<String> listaString = new ArrayList<>();

        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);

        System.out.println(listaString);

        // listaString.remove(1);
        // listaString.set(2, "Ejemplo Alterado");
        System.out.println(listaString.size()); //size es un metodo que retorna un entero (conteo de elementos)
    }
}
