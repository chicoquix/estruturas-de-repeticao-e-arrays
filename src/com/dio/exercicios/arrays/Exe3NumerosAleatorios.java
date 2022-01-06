package com.dio.exercicios.arrays;


import java.util.Random;

public class Exe3NumerosAleatorios {
    public static void main(String[] args) {
        /*
        Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
        Ao final mostre os números e seus sucessores.
        */
        int[] numRandom = new int[20];
        Random numeros = new Random();
        System.out.println("Números aleatórios: ");
        for(int i = 0; i<20; i++){
            numRandom[i] = numeros.nextInt(100);
            System.out.print(" "+numRandom[i]);
        }
        System.out.println("");
        System.out.println("Sucessores: ");
        for(int i = 0; i<20; i++){
            System.out.print(" "+(numRandom[i]+1));
        }

    }
}
