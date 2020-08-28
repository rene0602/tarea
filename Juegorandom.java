
package juegorandom;

import java.util.Random;
import java.util.Scanner;

public class Juegorandom {
    
         int numeros[] = new int[5];
         Random alasar = new Random();
         Scanner ent = new Scanner(System.in);
         int num1=0;

    public  void juego() {
        int num1, a = 0;
        boolean verdadero = true;
        do {
            System.out.print("ingrese 5 numeros aletorios entre 0 y 10: ");
            num1 = ent.nextInt();
            if (num1 < 0 || num1 > 10) {
                System.out.println("El numero esta repetido intente otra ves ");
             } else {
               verdadero = true;
                for (int i = 0; i < a; i++) {
                if (numeros[i] == num1) {
                  verdadero = false;
                  break;
                }
               }
             if (verdadero == false) {
             System.out.println("El número ingresado ya lo tiene reguistrado");
             } else {
             numeros[a] = num1;
              a++;
                   }
               }
            }

        } while (a < 5);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " - ");
        }
    }

    public  void comprobar() {
        boolean numeroganador = false;
        int num2 = alasar.nextInt(11);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num2) {
                numeroganador = true;
                break;
            }
        }
        if (numeroganador== true) {
            System.out.println("\nFelicidades,tú número fue el de la suerte fue: " + num2);
        }else{
            System.out.println("\nMala suerte,el número del juego es: " + num2);
        }
    }
       
}
