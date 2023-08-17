package com.lucca.lista_revisao.questoes.questao01;

public class ImprimirArray {
    int[] array;

    public static void imprimirArray(int[] array) {
        System.out.println("Tamanho:" + array.length);
        System.out.println("Vetor ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }
}