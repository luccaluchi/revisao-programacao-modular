package com.lucca.lista_revisao.questoes.questao10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    public static ArrayList<int[]> input() {

        ArrayList<int[]> input = new ArrayList<>();
        String path = "src/com/lucca/lista_revisao/questoes/questao10/input.txt";


        try {
            FileReader fileInput = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileInput);

            String line;
            int j = 0;
            while ((line = bufferedReader.readLine()) != null) {

                String[] itens = line.split(";");
                int[] intArray = new int[itens.length];
                for (int i = 0; i < itens.length; i++) {
                    intArray[i] = Integer.parseInt(itens[i]);
                }
                input.add(j, intArray);


                j++;
            }
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo" + e);
        }

        return input;
    }
}



        /*
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
    */