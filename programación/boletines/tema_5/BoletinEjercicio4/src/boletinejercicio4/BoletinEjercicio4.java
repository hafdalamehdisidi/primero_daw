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
        
        Scanner sc = new Scanner(System.in);
        /*
        -Inicializar una tabla.
        -Pediir al usuario un índice a eliminar.
        */
        
        //Inicalizar una tabla.
        
        int [] tabla = {1, 3,  5, 7, 9, 11, 13, 15, 17, 19};
         int indiceBorrar;
         mostararTabla(tabla);
         
         System.out.println("Introduzca el índice del elemento a eliminar (negativo para terminar) ");
         indiceBorrar = sc.nextInt();
         
         //Usamos el bucle while para introducir índice a borrar.
         while (indiceBorrar >= 0 && tabla.length > 1) {
            
             if (indiceBorrar < tabla.length) {
                 
                 tabla = eliminarElementoTabla(tabla, indiceBorrar);
                 
             } else {
                 System.out.println("El índice " + indiceBorrar + "está fuera de rango.");
             }
        
        }
         
    }

    private static void mostararTabla(int[] tabla) {
        
        for (int i = 0; i < tabla.length; i++) {
            
            System.out.print(tabla[i]);
            
        }
    }

    public  static int[] eliminarElementoTabla(int[] tabla, int indiceBorrar) {
        
        // Creamos una nueva tabla con un elemento menos que el anterios
        int[] nuevaTabla = new int [tabla.length  - 1];
        
        //Copiamos los elementos anteriores a índice a borrar
        
        for (int i = 0; i < indiceBorrar -1 ; i++) {
            
            nuevaTabla[i] = tabla[i];
            
        }
        
        //Copiamos los elementos posteriores al índice a borrar.
        
        for (int i = indiceBorrar +1; i < tabla.length; i++) {
            
            nuevaTabla[i -1] = tabla[i];
        }
        
        return nuevaTabla;
    }
    
}

