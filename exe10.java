//Crie um programa que exiba a tabuada do 9 utilizando o while.

import java.util.Scanner;

public class exe10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numTab = 9;

        System.out.println("tauada do " + numTab + ": ");

        int multiplicador = 1;
        while (multiplicador <= 10){
            int resultado = numTab * multiplicador;
            System.out.println(numTab + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }
    }
}
