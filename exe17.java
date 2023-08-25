/*Elabore um programa que leia uma sequência de números inteiros do usuário e determine
quantos números pares foram digitados antes do primeiro número ímpar. O programa deve parar
de ler quando o usuário digitar o número 0 utilizando o while. */

import java.util.Scanner;

public class exe17 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int paresAntesDeImpar = 0;
        boolean encontrouImpar = false;

        while (true) {
            System.out.print("digite um número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // encerra o loop se o número digitado for 0
            }

            if (!encontrouImpar) {
                if (numero % 2 == 0) {
                    paresAntesDeImpar++;
                } else {
                    encontrouImpar = true;
                }
            }
        }

        System.out.println("quantidade de números pares antes do primeiro ímpar: " + paresAntesDeImpar);
    }
    
}
