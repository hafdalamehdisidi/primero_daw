/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio13;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(factorial (20));
        
    }
    
    public static long factorial (long numero) {
        long rest = 1;
        if (numero > 0) {
            rest = numero  * factorial (numero -1);
        
        }
            return rest;
    }
    
}
