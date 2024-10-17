/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio2;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        intervalos(10, 20);
    }
    
    public static void intervalos (int numero1, int numero2) {
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i + " ");
        }
        System.out.println("");
    }
}
