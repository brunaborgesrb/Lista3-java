/*Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
números possuem mais de três dígitos. O programa deve parar de ler quando o usuário digitar o
número 0 utilizando o while. */

import java.util.Scanner;

public class exe21 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numerosComMaisDeTresDigitos = 0;

        while (true) {
            System.out.print("digite um número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // encerra o loop se o número digitado for 0
            }

            if (Math.abs(numero) > 999) {
                numerosComMaisDeTresDigitos++;
            }
        }

        System.out.println("quantidade de números com mais de três dígitos: " + numerosComMaisDeTresDigitos);
    }
    
}
