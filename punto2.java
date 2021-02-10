package com.mycompany.actividadderepaso;

import java.util.Scanner;

public class punto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra = null;
        System.out.println("Ingrese frase o palabra");
        palabra = leer.nextLine();
        if (esPalindromo(palabra) == true) {
            System.out.println("La palabra " + palabra + " es palidroma");
        } else {
            System.out.println("La palabra " + palabra + " no es palidroma");
        }
        
    }

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase();

        for (int i = 0, j = palabra.length() - 1; i <= j; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
