/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio4;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        int a = teclado.nextInt();
        System.out.println("Introduce el numero 2");
        int b = teclado.nextInt();
        
        System.out.println("El mayor es " + (maximo(a, b)));
    }
    
    public static int maximo (int a, int b) {
        int rest;
        if (a > b) {
            rest = a;
        }else {
            rest = b;
            
            
        }
        
        return rest;
        
    }
}
