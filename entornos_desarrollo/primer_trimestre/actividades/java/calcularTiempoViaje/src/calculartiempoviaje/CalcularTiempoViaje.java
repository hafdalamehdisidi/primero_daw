/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculartiempoviaje;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class CalcularTiempoViaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
         //Solicitamos distancia.
         System.out.println("Ingresa la distancia a recorrer (en KM).");
         double distance = keyword.nextDouble();
         
         //Solicitamos la velocidad.
         System.out.println("Introduce la velocidad media.");
         double mediaSpeed = keyword.nextDouble();
         
         //Calculamoss el tiempo.
         double time = distance / mediaSpeed;
         
         //Mostramos en pantalla el resultado
         System.out.println("El tiempo del viaje es: " + time);
    }
    
}
