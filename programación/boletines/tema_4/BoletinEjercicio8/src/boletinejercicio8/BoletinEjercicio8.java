/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio8;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        
        System.out.println("El númeo de divisores es: " + num + "" + contarDivisoresPrimos(num)); 
   }
    public static int contarDivisoresPrimos(int numero) {
    int contador = 0;
    
    //El bucle while es para evitar repetir número mútiplos, el for itera 2 veces para aumentar el contador.
    for (int i = 2; i <= numero; i++) {
        if (numero % i == 0 && esPrimo(i)) {
            contador++;
            while (numero % i == 0) {
                numero /= i;
            }
        }
    }
    
    return contador;
}

    //Función auxiliiar para saber si el número es primo.
private static boolean esPrimo(int num) {
    if (num < 2) return false;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) return false;
    }
    return true;
}
}
