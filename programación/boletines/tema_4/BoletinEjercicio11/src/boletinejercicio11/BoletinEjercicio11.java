/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio11;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a");
        double  a = sc.nextDouble();
        System.out.println("Introduce n");
        int  n = sc.nextInt();
        
        System.out.println(a + "elevado a " + n + " = " + potencia(a, n));
        
    }
    
    public static double potencia(double a, int n) {
       double producto =  1;
        for (int i = 0; i <= n; i++) {
            
            producto *= a;
        }
        return producto;
    }
    
}
