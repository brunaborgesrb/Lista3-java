/*Elabore um programa que leia uma sequência de números inteiros do usuário e exiba o menor
valor digitado que seja positivo e ímpar. O programa deve parar de ler quando o usuário digitar o
número 0 utilizando o while. */

import java.util.Scanner;

public class exe23 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int menorPositivoImpar = Integer.MAX_VALUE;

        while (true) {
            System.out.print("digite um número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // encerra o loop se o número digitado for 0
            }

            if (numero > 0 && numero % 2 != 0 && numero < menorPositivoImpar) {
                menorPositivoImpar = numero;
            }
        }

        if (menorPositivoImpar == Integer.MAX_VALUE) {
            System.out.println("nenhum número positivo ímpar foi digitado.");
        } else {
            System.out.println("menor valor positivo ímpar digitado: " + menorPositivoImpar);
        }

    }
}
