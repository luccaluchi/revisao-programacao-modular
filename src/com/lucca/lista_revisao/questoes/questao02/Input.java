package com.lucca.lista_revisao.questoes.questao02;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static int[] input() {
        ArrayList<Integer> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: (0 para sair)");
        int entrada = scanner.nextInt();
        input.add(entrada);
        if (entrada != 0) {
            while (entrada != 0) {
                System.out.println("Digite um número: (0 para sair)");
                entrada = scanner.nextInt();
                if (entrada != 0) input.add(entrada);
            }

        }
        int[] saida = input.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Entrada:");
        for (int num : saida){
            System.out.println(num);
        }
        System.out.println("-------");


        return saida;
    }



}