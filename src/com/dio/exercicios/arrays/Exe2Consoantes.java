package com.dio.exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Exe2Consoantes {
    public static void main(String[] args) {
                /*
        Faça um Programa que leia um vetor de 6 caracteres,
        e diga quantas consoantes foram lidas.
        Imprima as consoantes.
                */
        Scanner e = new Scanner(System.in);
        String letra;
        String[] consoantes = new String[6];
        int contConsoante = 0, contVogal = 0;

        for (int i = 0; i < consoantes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "ª caractere: ");
            letra = e.next().toUpperCase();

            if (letra.equalsIgnoreCase("A") ||
                    letra.equalsIgnoreCase("E") ||
                    letra.equalsIgnoreCase("I") ||
                    letra.equalsIgnoreCase("O") ||
                    letra.equalsIgnoreCase("U")) {
                contVogal++;
            } else {
                consoantes[i] = letra;
                contConsoante++;
            }
        }

        System.out.println("Quantidade de consoantes: " + contConsoante);
        for (int i = 0; i < 6; i++) {
            if (consoantes[i] != null) {
                System.out.println(consoantes[i]);
            }
        }


    }
}
