/*Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados (nota maior
ou igual a 7). */

import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double notas;
        int totalAlunos = 5;
        int alunosAprovados = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("digite a nota do aluno " + i + ": ");
            notas = input.nextDouble();

            if (notas >= 7) {
                alunosAprovados++;
            }
        }

        System.out.println("número de alunos aprovados: " + alunosAprovados);
    
    }
}