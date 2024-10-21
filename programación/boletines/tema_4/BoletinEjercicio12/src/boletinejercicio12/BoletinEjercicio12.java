/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio12;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer");
        int num1 = sc.nextInt();
        System.out.println("Introduce el número 2");
        int num2 = sc.nextInt();
       System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int operacion = sc.nextInt();
        
        System.out.println(calculadora(num1, num2, operacion));
    }
    
    public static double calculadora (int num1, int num2, int operacion) {
        double rest = 0;
        
        switch (operacion) {
            case 1:
                rest = num1 + num2;
                break;
                 case 2:
                rest = num1 - num2;
                break;
                 case 3:
                rest = num1 * num2;
                break;
                 case 4:
                rest = (double) num1 / num2;
                break;
                
                default:
                    System.out.println(" Operación incorrecta " + operacion);
        }
        
        return rest;
    }
    
}
