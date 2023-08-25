//Elabore um programa que calcule a soma dos números de 1 a 100 utilizando o while.

import java.util.Scanner;

public class exe8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = 1;
        int soma = 0;

        while (num <= 100){
            soma += num;
            num++;
        }
        System.out.println("a soma dos números de 1 a 100 é: " + soma);
    }
}
