//Faça um programa que calcule o produto dos números de 1 a 5 utilizando o while.

import java.util.Scanner;

public class exe9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = 1;
        int produto = 1;

        while (num <= 5) {
            produto *= num;
            num++;
        }
        System.out.println("o produto dos números de 1 a 5 é: " + produto);
    }
}
