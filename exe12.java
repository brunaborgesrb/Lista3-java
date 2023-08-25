/*Crie um programa que leia uma sequência de números inteiros do usuário e exiba a média dos
números digitados. O programa deve parar de ler quando o usuário digitar o número -1 utilizando
o while. */

import java.util.Scanner;

public class exe12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("digite um número inteiro (-1 para parar): ");
            int numero = input.nextInt();

            if (numero == -1) {
                break; // encerra o loop se o número digitado for -1
            }

            soma += numero;
            contador++;
        }

        if (contador == 0) {
            System.out.println("nenhum número foi digitado.");
        } else {
            double media = (double) soma / contador;
            System.out.println("média dos números digitados: " + media);
        }

    }
}
