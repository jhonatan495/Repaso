
package com.mycompany.actividadderepaso;

import java.util.Scanner;


public class punto_Potencia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int base=0,exponente=0,resultado=0;
        System.out.println("Ingrese la base");
        base=leer.nextInt();
        System.out.println("Ingrese la exponente");
        exponente=leer.nextInt();
        
        resultado = potencia(base, exponente);
        System.out.println("la potencia es " + resultado);
        
    }

    public static int Potencia(int base, int exponente) {
        int resultado = base;
        int count=0;
        for (int i = 0; i < base; i++) {
            if(count>0){
                for (int j = 0; j < count; j++) {
                    resultado+=resultado+base;
                }
            }
        }
        return resultado;
    }

}
