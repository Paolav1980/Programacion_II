
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Paola
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String nombre,apellido, direccion;
       int edad, altura;
       
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingrese su Apellido: ");
        apellido = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese su direccion: ");
        direccion = input.nextLine();
        
        System.out.println("Altura : ");
        altura = Integer.parseInt(input.nextLine());
        
        
        System.out.println(
            "Nombre: " + nombre + " " + apellido + "\n" +
            "Edad: " + edad + " años\n" +
            "Dirección: \"" + direccion + " " + altura + "\"\n"
        );

                
    }
    
}
