/*Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
números são divisíveis por 2, quantos são divisíveis por 3 e quantos são divisíveis por 5. O
programa deve parar de ler quando o usuário digitar o número 0 utilizando o while. */

import java.util.Scanner;

public class exe19 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numerosDivisiveisPor2 = 0;
        int numerosDivisiveisPor3 = 0;
        int numerosDivisiveisPor5 = 0;

        while (true) {
            System.out.print("digite um número inteiro (0 para parar): ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // Encerra o loop se o número digitado for 0
            }

            if (numero % 2 == 0) {
                numerosDivisiveisPor2++;
            }

            if (numero % 3 == 0) {
                numerosDivisiveisPor3++;
            }

            if (numero % 5 == 0) {
                numerosDivisiveisPor5++;
            }
        }

        System.out.println("quantidade de números divisíveis por 2: " + numerosDivisiveisPor2);
        System.out.println("quantidade de números divisíveis por 3: " + numerosDivisiveisPor3);
        System.out.println("quantidade de números divisíveis por 5: " + numerosDivisiveisPor5);
    }
    
}
