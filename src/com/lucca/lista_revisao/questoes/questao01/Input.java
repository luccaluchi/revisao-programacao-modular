package com.lucca.lista_revisao.questoes.questao01;

import java.util.Scanner;

public class Input {

    public static int[] input() {
        int[] input = new int[6];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            System.out.println("Digite um numero:");

            int numero = scanner.nextInt();
            scanner.nextLine();

            input[i] = numero;

        }
        return input;
    }

}

