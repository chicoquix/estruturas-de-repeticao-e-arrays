package dio.exercicios.loops;

import java.util.Scanner;

public class Exe1NomeIdade {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        //Exe 1
        /*
    Faça um programa que leia conjuntos de dois valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare o programa inserindo o valor 0 no campo nome)
        */
        String nome;
        int idade;

        while (true){
            System.out.println("Digite o nome do aluno: ");
            nome = e.next();
            if(nome.equalsIgnoreCase("0")) break;
            System.out.println("Digite a idade do aluno:");
            idade = e.nextInt();
        }

    }
}
