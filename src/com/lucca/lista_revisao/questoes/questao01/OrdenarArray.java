package com.lucca.lista_revisao.questoes.questao01;

public class OrdenarArray {

    public static int[] ordenarArray(int[] vetorOriginal) {
        int[] vetorInvertido;
        int tamanho = vetorOriginal.length;
        vetorInvertido = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorInvertido[i] = vetorOriginal[tamanho - 1 - i];
        }
        return vetorInvertido;
    }

}
