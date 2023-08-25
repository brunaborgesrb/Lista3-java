/*Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
números são pares e quantos números são ímpares entre o primeiro e o último número digitado.
O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while. */

import java.util.Scanner;

public class exe24 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("digite um número inteiro (0 para parar): ");
        int primeiroNumero = input.nextInt();
        
        if (primeiroNumero == 0) {
            System.out.println("Nenhum número foi digitado.");
            input.close();
            return;
        }

        int numerosPares = 0;
        int numerosImpares = 0;
        int ultimoNumero = primeiroNumero;

        while (true) {
            System.out.print("digite outro número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // encerra o loop se o número digitado for 0
            }

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }

            ultimoNumero = numero;
        }

        System.out.println("quantidade de números pares entre " + primeiroNumero + " e " + ultimoNumero + ": " + numerosPares);
        System.out.println("quantidade de números ímpares entre " + primeiroNumero + " e " + ultimoNumero + ": " + numerosImpares);
    }
}
