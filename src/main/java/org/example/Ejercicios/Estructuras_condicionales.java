package org.example.Ejercicios;
import java.util.Scanner;

public class Estructuras_condicionales {

 int matematicas;
 int biologia;
 int quimica;
 int promedio;
 

 public void imprimir_mensaje() {

  System.out.println("Las estructuras Condicionales Usando If - Else");
  System.out.println("Ejercisio: Calcular el promedio de las materias ");
 }
 public void operacion(){
  Scanner scanner= new Scanner(System.in);

  System.out.println('\n' + "Ingrese las notas de las materias:");
  System.out.print("Matematicas: ");
  matematicas = scanner.nextInt();
  System.out.print("Biolagia: ");
  biologia = scanner.nextInt();
  System.out.print("Quimica: ");
  quimica = scanner.nextInt();

  promedio = (matematicas + biologia + quimica) /3 ;

  //Se inicia la condición
  if ( promedio >=6 /*Condicion*/) {
   //instrucciones
   System.out.println(" Aprobo las materias con un promedio de: " + promedio);
  }else {
   System.out.println(" Reprobo las materias con un promedio de: " + promedio);
  }

 }
 public void Positivo_Negativo_Cero (){

  int numero;
  Scanner scanner = new Scanner(System.in);
  System.out.println('\n' + "Ejercicio 2");
  System.out.println("Este metodo leé un número entero del usuario y determine si el número es positivo, negativoo cero.");
  System.out.print("Ingrese un numero entero: ");
  numero = scanner.nextInt();

  if (numero <= 0){
   System.out.println("El numero es menor");
  } else if (numero >= 0) {
   System.out.println("El número es mayor");
  }else {
   System.out.println("El numero es 0");
  }
 }
 public void Mayor_numero(){
  Scanner scanner = new Scanner(System.in);
  System.out.println('\n' + "Ejercicio 3");
  System.out.println("Ingresa un numero entero y determina cual es el mayor");

  int numero_1;
  int numero_2;

  System.out.print('\n' + "Ingresa un número: ");
  numero_1 = scanner.nextInt();
  System.out.print('\n' + "Ingresa un número: ");
  numero_2 = scanner.nextInt();

  if (numero_1 > numero_2){
   System.out.println(" El numero mayor es: " + numero_1);
  } else if (numero_1 < numero_2) {
   System.out.println(" El número mayor es: " + numero_2);
  }else {
   System.out.println("Los números son iguales ");
  }
 }
}
