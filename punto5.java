
package com.mycompany.actividadderepaso;

import java.util.Scanner;


public class punto5 {

    
    public static void main(String[] args) {
     
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese un numero: ");
          int num = leer.nextInt();
          
        System.out.println("El factorial del numero: "+num+" es: "+factorial(num)); 
    }
    
    
    public static double factorial(int n) {
    int aux=1;
        for (int i = 2; i <= n; i++) {
           aux = aux* i; 
        }
        return aux;
    }
}
