package com.lucca.lista_revisao.questoes.questao06;

public class FirstDigits {

    public static String firstDigits(int digits){
        String aux = Integer.toString(digits);
        return aux.substring(0 , 3);
    }
}
