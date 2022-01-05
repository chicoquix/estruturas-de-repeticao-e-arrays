package com.dio.exercicios.arrays;

public class Exe1OrdemInversa {
    public static void main(String[] args) {
        /*
    Crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
    */
        int [] vetor = {-5, -6, 15, 50, 8, 4};
        int cont = (vetor.length - 1);

        for(int i = 0;i<vetor.length; i++){


            System.out.println("Vetor Ordem Inversa: "+vetor[cont]);

            cont--;
        }
    }
}
