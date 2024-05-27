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
}
