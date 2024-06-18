package org.example;

import org.example.Ejercicios.Calculadora;
import org.example.Ejercicios.Estructuras_condicionales;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /*===============================================================================================
           INSTANCIA: nombre de la clase | VARIABLE: almacena la instancia  = Se iguala a la instancia
           VARIABLE instancia.Medotodo/Funcion creado en la clase
         ================================================================================================*/

        //INSTANCIA              | VARIABLE             | Se iguala a la instancia
        Estructuras_condicionales estructuraCondicional = new Estructuras_condicionales ();
        //VARIABLE INSTANCIA .METODO/FUNCION
        estructuraCondicional.imprimir_mensaje();
        estructuraCondicional.operacion();
        estructuraCondicional.Positivo_Negativo_Cero();
        estructuraCondicional.Mayor_numero();
        estructuraCondicional.Año_Biciesto();

        //Instancia | variable   | Se iguala a la instancia
        Calculadora  calculadora = new Calculadora();
        //VARIABLE INSTANCIA .METODO/FUNCION
        calculadora.Operaciones();


    }
}