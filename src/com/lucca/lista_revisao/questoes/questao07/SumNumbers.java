package com.lucca.lista_revisao.questoes.questao07;

public class SumNumbers {
    public SumNumbers() {
    }

    public static int sumNumbers(int number) {
        String result = "";
        int number1 = number / 10;
        int number2 = number % 10;
        if (!((number1 + number2) > 9)){
            int sum = number1 + number2;
            result = String.format("%d%d%d",number1, sum, number2);
        }
        else{
            int sum = number1 + number2;
            result = String.format("%d%d%d",(number1 +1), (sum % 10), number2);

        }
        return Integer.parseInt(result);
    }
}
