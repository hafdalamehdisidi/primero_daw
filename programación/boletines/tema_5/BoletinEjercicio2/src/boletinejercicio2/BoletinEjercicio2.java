/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio2;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumeros;
        System.out.println("¿Cuántos números quieres introducir?");
        totalNumeros = sc.nextInt();
        int numeros[] = new int[totalNumeros];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número");
          
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Total:" + numeros.length);
        
        for (int i = numeros.length -1; i>= 0; i--) {
         
            
            System.out.println(numeros[i]);
        }
        
    }
    
    
}
