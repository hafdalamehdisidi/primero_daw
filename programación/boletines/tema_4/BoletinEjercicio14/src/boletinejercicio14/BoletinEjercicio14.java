/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio14;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int numero = 0; numero <= 100; numero++) {
            
            System.out.println("El fibonacci de: " + numero + " ---> " + fibonacci(numero));
        }
        
      
    }
    
    public static int fibonacci (int numero) {
        int rest = 1;
        
        if (numero > 1) {
            rest = fibonacci(numero -1) + fibonacci(numero - 2);
        }
         return rest;
    }
    
}
