/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Fede
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //le asignamos a la nueva variable de leer, la funcion de leer texto del usuario

        //le damos el valor de string(cadena), a nombre
            System.out.println("ingresa tu nombre:");
        //imprimimos que porfavor ingrese el nombre
        String nombre = leer.next();
        // nombre va a ser igual al input del usuario 
        System.out.println("¡Hola, " + nombre + ", cómo estas?");
        //finalmente se imprime un texto  con el nombre 

    }

}
