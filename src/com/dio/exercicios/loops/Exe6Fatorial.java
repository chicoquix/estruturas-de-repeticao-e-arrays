package com.dio.exercicios.loops;

import java.util.Scanner;

public class Exe6Fatorial {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        /*
    Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
    */
        int fatorial = 0, resultado = 1;
        System.out.println("Digite o número que deseja calcular a fatorial: ");
        fatorial = e.nextInt();
        for (int i = 1; i<fatorial;i++){
            resultado += resultado * i;
        }
        System.out.println(fatorial+"! = "+resultado);
    }
}
