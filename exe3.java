//Elabore um programa que leia um número inteiro e exiba todos os seus divisores.

import java.util.Scanner;

public class exe3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("digite um número inteiro: ");
        int numero = input.nextInt();

        System.out.println("divisores de " + numero + ":");
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

    }
}
