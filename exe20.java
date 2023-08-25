/*Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
dos números divisíveis por 3. O programa deve parar de ler quando o usuário digitar o número 0
utilizando o while. */

import java.util.Scanner;

public class exe20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("digite um número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // encerra o loop se o número digitado for 0
            }

            if (numero % 3 == 0) {
                soma += numero;
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("nenhum número divisível por 3 foi digitado.");
        } else {
            double media = (double) soma / contador;
            System.out.println("média dos números divisíveis por 3: " + media);
        }
    }
}
