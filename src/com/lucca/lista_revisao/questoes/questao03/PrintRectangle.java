package com.lucca.lista_revisao.questoes.questao03;

public class PrintRectangle {
    public static void print(char character) {
        int length = 7;
        int height = 9;

        for (int i = 0; i < length; i++) {
            System.out.print(character);
        }
        System.out.println();
        for (int j = 0; j < (height -2); j++) {
            System.out.print(character);
            for (int l = 0; l < (length - 2); l++) {
                System.out.print("-");
            }
            System.out.println(character);
        }
        for (int k = 0; k < length; k++) {
            System.out.print(character);
        }

    }

}
