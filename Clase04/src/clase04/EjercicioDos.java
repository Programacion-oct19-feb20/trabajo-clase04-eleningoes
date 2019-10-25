/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioDos {
    /*
    Generara un programa que permita pedir datos por teclado para
    ingreso de nombre 
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de costo de matricula
    
    Luego precentar en pantalla los datos de la siguiente forma:
    Datos Personales:
    Nombre:
    Ciudad de Nacimiento:
    Edad:
    Matricula:
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Comentario
        String nombres;
        String ciudad;
        int edad;
        double matricula;
        
        System.out.println("Ingrese sus nombres");
        nombres = entrada.nextLine();
        System.out.println("Ingrese su ciudad de nacimiento");
        ciudad = entrada.nextLine(); // Ingreso de tipo cadena
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt(); // Ingreso de enteros
        System.out.println("Ingrese el costo de su matricula"
                + "(Separando los decimales con una coma)");
        matricula = entrada.nextDouble(); // Ingreso de decimales
        
        
        System.out.printf("Datos personales:\nNombres: %s\n", nombres);
        System.out.printf("Ciudad de nacimiento: %s\n", ciudad);
        System.out.printf("Edad: %d\n", edad);
        System.out.printf("Matricula: %.2f dólares\n", matricula); 
        //Ruerda tienes que poder el numero despues del punto 
    }
}
