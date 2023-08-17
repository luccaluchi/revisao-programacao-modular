package com.lucca.lista_revisao.questoes.questao02;

public class VectorSum {

    int[] sum;

    public static int[] sum(int[] inputVector) {
        boolean isEven;
        int vectorLength = 0, j = 0;

        if (inputVector.length % 2 == 0) {
            vectorLength = inputVector.length / 2;
            isEven = true;
        } else {
            vectorLength = (inputVector.length / 2 + 1);
            isEven = false;
        }

        int[] sum = new int[vectorLength];

        for (int i = 0; i < inputVector.length -1; i += 2) {
            sum[j] = inputVector[i] + inputVector[i + 1];
            j++;
        }

        if ( ! isEven) {
            sum[sum.length - 1] = inputVector[inputVector.length - 1] += inputVector[inputVector.length - 1];
        }

        return sum;

    }

}
