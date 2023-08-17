package com.lucca.lista_revisao.questoes.questao06;
/*
    Primeiro prêmio, segunda parte dos digitos do prêmio.
*/

public class SecondDigits {
    public static String secondaryDigits(int digits){
        String aux = Integer.toString(digits);
        return aux.substring(aux.length() - 3 , aux.length());
    }
}
