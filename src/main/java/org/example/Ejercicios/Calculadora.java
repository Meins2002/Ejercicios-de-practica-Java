package org.example.Ejercicios;
import java.util.Scanner;

public class Calculadora {

    public void Operaciones() {

    int Operacion;
    int num_1;
    int num_2;
    int resultado;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Operaciones con estructura condicional anidadas");
    System.out.println("Calculadora");

    System.out.println("Digite la operación deseada: " + '\n' + " 1 = Suma" + '\n' + " 2 = Resta" + '\n' +
            " 3 = Multiplicación" + '\n' + " 4 = División");

    System.out.print("Opción: ");
    Operacion = scanner.nextInt();
    if (Operacion == 1){
        System.out.println(" Suma :");
        System.out.print(" Ingresa Número = " );
        num_1 = scanner.nextInt();
        System.out.print(" Ingresa Número = ");
        num_2 = scanner.nextInt();

        resultado = num_1 + num_2;

        System.out.println("El resultado de la suma es: " + resultado);
    } else if (Operacion == 2) {
        System.out.println(" Resta :");
        System.out.print(" Ingresa Número = " );
        num_1 = scanner.nextInt();
        System.out.print(" Ingresa Número = ");
        num_2 = scanner.nextInt();

        resultado = num_1 - num_2;

        System.out.println("El resultado de la resta es: " + resultado);
    } else if (Operacion == 3) {
        System.out.println(" Multiplicación :");
        System.out.print(" Ingresa Número = " );
        num_1 = scanner.nextInt();
        System.out.print(" Ingresa Número = ");
        num_2 = scanner.nextInt();

        resultado = num_1 * num_2;

        System.out.println("El resultado de la multiplicación  es: " + resultado);
    } else if (Operacion == 4) {
        System.out.println(" División :");
        System.out.print(" Ingresa Número = " );
        num_1 = scanner.nextInt();
        System.out.print(" Ingresa Número = ");
        num_2 = scanner.nextInt();

        resultado = num_1 / num_2;

        System.out.println("El resultado de la división es: " + resultado);
    }else {
        System.out.println("ESA OPCIÓN NO EXISTE");
    }
    scanner.close();
    }
}
