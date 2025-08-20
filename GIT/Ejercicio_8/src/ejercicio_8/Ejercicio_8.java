/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double numero1, numero2, division;
         System.out.println("Ingrese el primer número: ");
         numero1 = input.nextDouble();
         
         System.out.println("Ingrese el segundo número: ");
         numero2 = input.nextDouble();
         
         division = (numero1 / numero2);
         
         System.out.println("el resultado de la división es : " + division);
                 
         
    }
    
}
