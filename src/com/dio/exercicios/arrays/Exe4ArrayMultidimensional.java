package com.dio.exercicios.arrays;

import java.util.Random;

public class Exe4ArrayMultidimensional {
    public static void main(String[] args) {
        /*
    Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
        */
        int[][] matriz = new int [4][4];
        Random numeros = new Random();

        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                matriz[i][j] = numeros.nextInt(9);
            }
        }
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }

    }
}
