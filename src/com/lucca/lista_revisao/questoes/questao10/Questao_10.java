package com.lucca.lista_revisao.questoes.questao10;

import java.util.ArrayList;

public class Questao_10 {
    public static void questao10() {
        ArrayList<int[]> fileReaded = new ArrayList<>();
        fileReaded = Input.input();

        for (int[] arr : fileReaded) {
            int [] arrSum = VectorSum.sum(arr);
            for (int num : arrSum) {
                System.out.print(num + " ");
            }
            System.out.println("");

        }

    }
}
