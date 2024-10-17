/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio15;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        int n = teclado.nextInt();
        int cuentaPrimos = 0;
        boolean esPrimo = true; // En principio el número es primo.
        
        for (int numero = 1; numero <= n; numero++) {
            
            //Buscamos los dividendos
            
            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                }
                
            }
            
            if (esPrimo) {
                cuentaPrimos++;
                System.out.println(numero + " es primo. ");
                
            } else {
                System.out.println(numero + " no es primo.");
            }
        }
        System.out.println("El número de primo entre 1 y " + n + " es " + cuentaPrimos);
        
        
            
        }
    }
    
