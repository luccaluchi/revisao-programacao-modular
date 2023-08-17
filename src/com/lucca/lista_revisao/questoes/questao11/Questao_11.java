package com.lucca.lista_revisao.questoes.questao11;

import com.lucca.lista_revisao.questoes.questao10.Input;
import com.lucca.lista_revisao.questoes.questao10.VectorSum;

import java.util.ArrayList;

public class Questao_11 {

    public static void questao11() {

        ArrayList<String> fileReaded = new ArrayList<>();
        fileReaded = File.input();

        for (String array : fileReaded) {

            System.out.print(array + ": ");
            if (Date.validator(array)) {
                System.out.print("Válida.");
            }
            System.out.println(" ");

        }

    }
}
