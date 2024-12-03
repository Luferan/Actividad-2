/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio11;
import java.util.Scanner;
public class Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double N1, N2, N3, mayor;
       
       Scanner num = new Scanner(System.in);
       // Pedimos los valores de los tres números para compararlos
        System.out.println("Asigne un número a N1: ");
        N1 = num.nextDouble();
        
        System.out.println("Asigne un número a N2: ");
        N2 = num.nextDouble();
        
        System.out.println("Asigne un número a N3: ");
        N3 = num.nextDouble();
        /* Creamos condicionales para saber cuál de los tres números ingresados
        es el mayor
        */
            if ((N1 > N2)&&(N1 > N3)){
                mayor = N1;
            }
        // Si el primer número no es el mayor, se hace la prueba con el segundo
            else if (N2>N3){
                mayor = N2;
            }
        /* Si el primero y el segundo no son el número más grande, entonces
        el tercero si lo es
        */ 
            else {
                mayor = N3;
            }
        System.out.println("El mayor entre "+N1+ ", "+N2+", "+N3+ " es "+mayor);
        }
            
    }
    
