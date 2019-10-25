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
public class EjercicioTres {
    /*
    Generar un proograma que permita pedir datos por teclado para:
    Ingreso de nombres completo de un estudiante
    ingreso de nota 1 (debe ser entero)
    ingreso de nota 2 (debe ser entero)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe de Alumno:
    Nombres Completos:
    Ciclo:
    Nota 1:
    Nota 2:
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        String nombres;
        String ciclo;
        int nota1;
        int nota2;
        
        
        System.out.println("Ingresar los nombres completos del estudiante:");
        nombres = entrada.nextLine();
        System.out.println("Ingresar el ciclo:");
        ciclo = entrada.nextLine();
        System.out.println("Ingresar la primera nota(en enteros):");
        nota1 = entrada.nextInt();
        System.out.println("ingresar la segunda nota(en enteros):");
        nota2 = entrada.nextInt();
        
        
        System.out.printf("Informe del estudiante:\nNombres Completos: "
                + "%s\nCiclo: %s\nNota 1: %d\nNota 2: %d\n", 
                nombres, ciclo, nota1, nota2);
    }
}
