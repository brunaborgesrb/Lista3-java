/*Desenvolva um programa que exiba todos os múltiplos de 3 no intervalo de 1 a 50 utilizando o
while. */

import java.util.Scanner;

public class exe15 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero = 1;
        System.out.println("múltiplos de 3 no intervalo de 1 a 50:");
        
        while (numero <= 50) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
