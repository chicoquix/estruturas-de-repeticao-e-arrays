package dio.exercicios.loops;

import java.util.Scanner;

public class Exe4ParImpar {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        /*
        Faça um programa que peça N números inteiros,
        calcule e mostre a quantidade de números pares
        e a quantidade de números impares.
        */

        int qtd = 0, qtdPar = 0, qtdImpar = 0, numero = 0, cont = 0;
        System.out.println("Informe a quantidade de números inteiros: ");
        qtd = e.nextInt();
        do{
            System.out.println("Digite o "+(cont+1)+"º número: ");
            numero = e.nextInt();
            cont++;
            if(numero % 2 == 0){
                qtdPar++;
            }else {
                qtdImpar++;
            }

        }while (qtd>cont);

        System.out.println("A quantidade de números pares é: "+qtdPar);
        System.out.println(" Já a quantidade de números Impares é: "+qtdImpar);


    }
}
