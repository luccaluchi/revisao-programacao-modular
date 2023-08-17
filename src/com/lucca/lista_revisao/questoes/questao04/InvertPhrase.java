package com.lucca.lista_revisao.questoes.questao04;

public class InvertPhrase {

    public static String invertPhrase(String phrase){
        StringBuilder reversedPhrase = new StringBuilder();
        reversedPhrase.append(phrase);
        reversedPhrase.reverse();
        return reversedPhrase.toString();
    }
}
