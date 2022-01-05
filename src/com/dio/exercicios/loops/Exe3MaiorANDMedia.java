package com.dio.exercicios.loops;

import java.util.Scanner;

public class Exe3MaiorANDMedia {
    public static void main(String[] args) {
         /*
    Faça um programa que leia 5 números
    e informe o maior número
    e a média desses números.
        */
        Scanner e = new Scanner(System.in);

        double numero = 0, soma = 0, media = 0, maior = 0;

        System.out.println("Digite 5 números para vermos qual é o maior e a media");
        for(int i=0; i<5;i++){
            System.out.println((i+1)+"º Número: ");
            numero = e.nextInt();
            if(numero>maior) maior = numero;
            soma +=numero;
            media = soma/5;
        }
        System.out.println("O maior número é: "+maior);
        System.out.println("A média dos números digitados é: "+media);
    }
}
