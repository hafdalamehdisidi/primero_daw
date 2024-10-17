/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio1;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        
        eco (numero);
        
    }
    
   public static void eco (int n) {
       for (int i = 0; i < n; i++) {
           System.out.println("eco...");
       }
   }
    
}
