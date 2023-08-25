/*Faça um programa que leia um número inteiro e exiba o número invertido. Por exemplo, se o
número lido for 123, o programa deve exibir 321. */

import java.util.Scanner;

public class exe7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.print("digite um número inteiro: ");
        numero = input.nextInt();

        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("número invertido: " + numeroInvertido);
    }
}
