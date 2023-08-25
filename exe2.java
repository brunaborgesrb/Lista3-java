//Faça um programa que exiba a soma dos dígitos de um número inteiro fornecido pelo usuário.

import java.util.Scanner;

public class exe2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.println("digite um número inteiro: ");
        numero = input.nextInt();
        
        int soma = 0;
        int tempNumero = numero;
        
        while (tempNumero > 0) {
            int digito = tempNumero % 10;
            soma += digito;
            tempNumero /= 10;
        }
        
        System.out.println("a soma dos dígitos é: " + soma);

    }
    
}
