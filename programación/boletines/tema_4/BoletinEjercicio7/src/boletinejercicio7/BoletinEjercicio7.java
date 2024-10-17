/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio7;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        int numero = teclado.nextInt();
        
        System.out.println(numero + (esPrimo(numero)?" " : " no") + " es primo");
    }
    
    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)  {
                return false;
            }
        }
        return true;
    }
   
}
