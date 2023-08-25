/*Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
dos números que estão entre 50 e 100. O programa deve parar de ler quando o usuário digitar o
número 0 utilizando o while. */

import java.util.Scanner;

public class exe22 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("digite um número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // Encerra o loop se o número digitado for 0
            }

            if (numero >= 50 && numero <= 100) {
                soma += numero;
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("nenhum número entre 50 e 100 foi digitado.");
        } else {
            double media = (double) soma / contador;
            System.out.println("média dos números entre 50 e 100: " + media);
        }
    }
}
