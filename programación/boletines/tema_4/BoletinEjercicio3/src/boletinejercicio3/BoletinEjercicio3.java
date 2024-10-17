/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio3;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elije una opción");
        int  opcion = teclado.nextInt();
        System.out.println("Introduce el radio de la base");
        double radio = teclado.nextDouble();
        System.out.println("Introduce la altura");
        double altura = teclado.nextDouble();
        calcularArea (opcion, radio, altura);
        calcularVolumen (opcion, radio, altura);
    }
    
    public static void calcularArea(int opcion, double radio, double altura) {
        
        double  resultado;
        
        if (opcion == 1) {
            resultado = 2 * Math.PI * radio * (altura + radio);
            System.out.println("Area = " + resultado);
        }
    }
    
    public static void calcularVolumen(int opcion, double radio, double altura) {
       double resultado;
       
        if (opcion == 2) {
            
            resultado = 2 * Math.PI * (radio * radio) *altura;
            
            System.out.println("El volumen es = " + resultado);
        }
       
    }     
}
