/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinejercicio5;

import java.util.Scanner;

/**
 *
 * @author Sidi
 */
public class BoletinEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        int a = teclado.nextInt();
        System.out.println("Introduce el numero 2");
        int b = teclado.nextInt();
        System.out.println("introduce el número 3");
        int c = teclado.nextInt();
        
        System.out.println("El mayor es " + (maximo(a, b, c)));
    }
    
    public static int maximo (int a, int b, int c) {
        int rest;
        if (a > b) {
            rest = a;
        }else {
            rest = b;
        }
         
        if (rest <= c) {
            rest = c;
        }
        return rest;
    }
    }
    
/*
La función que hace llamada a otra:
Se utiliza para reutiizar código.
public static int maximo3(int a, int b, int c) {
return maximo2(maximo2(a, b), c);
}
*/

/*
Máximo de 4:
public static int maximo4(int a, int b, int c, d) {
return maximo3 (maximo3(a, b, c), d);

}
*/