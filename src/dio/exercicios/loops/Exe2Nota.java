package dio.exercicios.loops;

import java.util.Scanner;

public class Exe2Nota {
    public static void main(String[] args) {
        //Exe 2
        /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido
    e continue pedindo
    até que o usuário informe um valor válido.
        */
        Scanner e = new Scanner(System.in);

        int nota = 0;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = e.nextInt();

        //Valida nota
        while (nota > 10){
            System.out.println("Nota inválida, digite uma nota entre 0 e 10:");
            nota = e.nextInt();
        }


    }
}
