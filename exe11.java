/*Crie um programa que leia uma sequência de números inteiros do usuário e exiba o maior e o
menor valor digitado. O programa deve parar de ler quando o usuário digitar o número 0
utilizando o while. */

import java.util.Scanner;

public class exe11 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int maior = Integer.MIN_VALUE; // inicializa com o menor valor possível
        int menor = Integer.MAX_VALUE; // inicializa com o maior valor possível

        while (true) {
            System.out.print("digite um número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // encerra o loop se o número digitado for 0
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("nenhum número foi digitado.");
        } else {
            System.out.println("maior valor: " + maior);
            System.out.println("menor valor: " + menor);
        }

    }
}
