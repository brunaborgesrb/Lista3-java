/*Faça um programa que leia um número inteiro e exiba a soma dos seus dígitos elevados ao cubo
utilizando o while. */

import java.util.Scanner;

public class exe13 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("digite um número inteiro: ");
        int numero = input.nextInt();

        int soma = 0;
        int tempNumero = Math.abs(numero); // garante que o número seja positivo

        while (tempNumero > 0) {
            int digito = tempNumero % 10;
            int cuboDoDigito = (int) Math.pow(digito, 3);
            soma += cuboDoDigito;
            tempNumero /= 10;
        }

        System.out.println("a soma dos dígitos elevados ao cubo é: " + soma);


    }
    
}
