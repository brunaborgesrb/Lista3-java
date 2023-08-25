//Faça um programa que exiba os números ímpares de 1 a 100 utilizando o while.

import java.util.Scanner;

public class exe14 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero = 1;

        System.out.println("números ímpares de 1 a 100:");

        while (numero <= 100) {
            System.out.println(numero);
            numero += 2; // incremento de 2 para pular os números pares
        }
    }
    
}
