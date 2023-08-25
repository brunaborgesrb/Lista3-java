/*Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior
ou igual a 7) utilizando o while. */

import java.util.Scanner;

public class exe16 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int contador = 0; // inicializa o contador de alunos aprovados

        int totalAlunos = 5; // número total de alunos

        int i = 0; // contador do loop
        while (i < totalAlunos) {
            System.out.print("digite a nota do aluno " + (i + 1) + ": ");
            double nota = input.nextDouble();

            if (nota >= 7) {
                contador++;
            }

            i++;
        }

        System.out.println("número de alunos aprovados: " + contador);
    }
}
