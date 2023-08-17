package com.lucca.lista_revisao.questoes.questao04;

import java.util.Scanner;

/*

04 - Elabore um programa que leia uma frase e mostre-a invertida na tela.
Após mostrar a primeira frase, o programa deve ler e imprimir outra, assim fazendo até que o usuário digite a palavra “fim”.
 */
public class Questao_04 {

    public static void questao04() {
        Scanner scanner = new Scanner(System.in);
        String phrase;
        String invertedPhrase;
        System.out.println("Digite uma frase: ");
        phrase = scanner.nextLine();


        if (!(phrase.equalsIgnoreCase("fim")))
        {
            while (!(phrase.equalsIgnoreCase("fim"))) {
                invertedPhrase = InvertPhrase.invertPhrase(phrase);
                System.out.println(invertedPhrase);
                System.out.println("Digite uma frase: ");
                phrase = scanner.nextLine();
            }

        }
    }
}
