package dio.exercicios.loops;

import java.util.Scanner;

public class Exe5Tabuada {
    public static void main(String[] args) {
        /*
    Desenvolva um gerador de tabuada,
    capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
    O usuário deve informar de qual numero ele deseja ver a tabuada.
    A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
    */

        Scanner e = new Scanner(System.in);

        int numero;
        System.out.println("Digite o número que deseja saber a tabuada: ");
        numero = e.nextInt();

        for(int i = 0; i<10; i++){
            System.out.println(numero+" X "+(i+1)+" = "+numero*(i+1));
        }
    }
}
