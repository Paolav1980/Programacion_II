/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num_1, num_2, suma, resta, multiplicacion, division;
        
        System.out.println(" Ingrese el primer numero: ");
        num_1 = input.nextInt();
        
        System.out.println(" Ingrese el segundo  numero: ");
        num_2 = input.nextInt();
        
        suma = (num_1 + num_2);
        resta = (num_1 - num_2);
        multiplicacion = (num_1 * num_2);
        division = (num_1 / num_2);
        
        System.out.println(" Suma: " + suma + "   Resta: " + resta + " Multiplicacion : " + multiplicacion + " Division: " + division );
        
        
        
        
    }
    
}
