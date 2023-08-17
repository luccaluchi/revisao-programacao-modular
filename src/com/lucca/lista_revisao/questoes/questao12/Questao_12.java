package com.lucca.lista_revisao.questoes.questao12;

import com.lucca.lista_revisao.questoes.questao11.Date;

import java.util.ArrayList;

public class Questao_12 {

    public static void questao12(){

    ArrayList<String> fileReaded = new ArrayList<>();

    fileReaded = File.input();

        for (String phrase : fileReaded) {
        System.out.println(phrase + "invertida: ");
        System.out.println(InvertPhrase.invertPhrase(phrase));
        System.out.println(" ");

    }

}
}
