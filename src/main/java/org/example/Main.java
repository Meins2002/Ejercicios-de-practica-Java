package org.example;

import org.example.Ejercicios.Calculadora;
import org.example.Ejercicios.Estructuras_condicionales;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Instancia     | variable que almacena la instancia  | Se iguala a la instancia
        Estructuras_condicionales estructuraCondicional = new Estructuras_condicionales ();

        //Variable de la instancia | Medotodo creado en la clase
        estructuraCondicional.imprimir_mensaje();
        estructuraCondicional.operacion();
        estructuraCondicional.Positivo_Negativo_Cero();
        estructuraCondicional.Mayor_numero();

        Calculadora calculadora = new Calculadora();
        calculadora.Operaciones();

    }
}