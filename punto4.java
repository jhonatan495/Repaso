
package com.mycompany.actividadderepaso;

import java.util.Scanner;


public class punto4 {

    
    public static void main(String[] args) {
        
           Scanner leer = new Scanner(System.in);
        int total=1;
        System.out.println("Ingrese dos numeros para la potencia ");
        System.out.println("Ingrese el numero n:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el numero m:");
        int num2=leer.nextInt();
        
        for (int i = 0; i < num2; i++) {
             total = num1*total;
        }
        System.out.println("El resultado es: "+total);
    }
    
}
