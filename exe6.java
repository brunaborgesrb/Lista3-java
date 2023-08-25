//Elabore um programa que leia um número inteiro e exiba a soma dos dígitos pares desse número.

import java.util.Scanner;

public class exe6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("digite um número inteiro: ");
        int numero = input.nextInt();

        int soma = 0;
        int tempNumero = numero;

        while (tempNumero > 0) {
            int digito = tempNumero % 10;
            if (digito % 2 == 0) {
                soma += digito;
            }
            tempNumero /= 10;
        }

        System.out.println("a soma dos dígitos pares é: " + soma);
    }
    
}
