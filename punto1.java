
package com.mycompany.actividadderepaso;

public class punto1 {

    public static void main(String[] args) {
        int NumeroMayor=0;
       int array[] =  {1,6,3,4};
        
        for (int i = 0; i < array.length; i++) {
            if(array[i]>NumeroMayor){
                NumeroMayor=array[i]; 
            }
        }
        System.out.println("El numero mayor es: "+NumeroMayor);
    }
    
}
