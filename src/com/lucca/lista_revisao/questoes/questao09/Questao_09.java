/*
09 - Sabendo que 1º de janeiro de 2024 será uma segunda feira,
     escreva um método que receba uma data e diga em qual dia
     da semana esta data acontecerá em 2024. Escreva um programa
     principal para testar seu método.
 */
package com.lucca.lista_revisao.questoes.questao09;

import java.util.Scanner;

public class Questao_09 {
    public static void questao09(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato DD/MM/AAAA: ");
        String input = scanner.nextLine();

        if (DateValidator.validator(input)){
            System.out.println(ZellerAlgorithm.calculateDayOfWeek(input));
        }

    }
}
