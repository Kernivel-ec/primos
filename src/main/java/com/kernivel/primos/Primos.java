package com.kernivel.primos;

/**
 * @author ING. Roberto Calero
 * www.kernivel.com
 * www.buymeacoffee.com/kernivel
 */

/*
 * Reto NUMEROS PRIMOS
 * ¿ES UN NÚMERO PRIMO?
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 25.
 */

public class Primos {

    public static void main(String[] args) {
        //Mensaje sobre el proposito del ejercicio
        System.out.println("Numeros Primos del 1 al 25");
        //Variable con la cual se determinara en numero de divisiones con residuo 0
        int contador = 0;
        //For para recorrer los numeros del 1 al 25
        for(int n= 1 ; n <= 25 ; n++){
            /*
            * For para recorrer los numeros del 1 al numero "n" actual del primer for
            * Dividimos el numero actual "n" del primer for para todos sus anteriores
            */
            for(int x = 1 ; x <= n ; x++){
                /*
                * Division del numero "n" para sus anteriores "x" y comprobamos que el reciduo sea cero
                * De ser 0 aumentamos en uno el contador
                * Contamos las veces que el residuo es cero
                */
                if(n % x == 0){
                    contador++;
                    //contador = contador + 1;
                }
            }
            /*
            * Solo cuando el contador tenga un valor de 2 el numero es primo
            * Recordemos que el numero primo es divisible para 1 y para si mismo
            * Esto quiere decir que solo cuando el contador tenga el valor de 2 sera primo
            */
            if(contador == 2){
                    System.out.println("El numero " + n + " es Primo");
            }
            //Reiniciamos el contador cada vez que se comprueba un nuevo numero
            contador = 0;
        }
 
    }
}
