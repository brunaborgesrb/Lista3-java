/*Crie um programa que leia uma sequência de números inteiros do usuário e exiba quantos
números pares e quantos números ímpares foram digitados. O programa deve parar de ler quando
o usuário digitar o número 0 utilizando o while. */

import java.util.Scanner;

public class exe18 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numerosPares = 0;
        int numerosImpares = 0;

        while (true) {
            System.out.print("digite um número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // Encerra o loop se o número digitado for 0
            }

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("quantidade de números pares digitados: " + numerosPares);
        System.out.println("quantidade de números ímpares digitados: " + numerosImpares);
    }
}
