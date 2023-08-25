 //Desenvolva um programa que calcule a média de altura de 5 pessoas.

import java.util.Scanner;

public class exe4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double alturas = 0;
        System.out.println("insira as alturas ");
        for(int i = 1; i <= 5; i++){
            System.out.println("altura: ");
            double altura = input.nextDouble();
            alturas += altura;
        }
        double media = alturas/5;
        System.out.println("a média das alturas é: " + media);
        
    }
}
