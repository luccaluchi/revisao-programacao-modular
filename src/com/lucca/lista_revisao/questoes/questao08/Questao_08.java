/*
08 - Escreva um método que verifique se uma data é válida, a partir de um dado recebido do usuário no formato DD/MM/AAAA.
Se a data for inválida, informe ao usuário onde está o erro.
*/

package com.lucca.lista_revisao.questoes.questao08;

import java.util.Scanner;

public class Questao_08 {

    public static void questa08(){

        int day, month, year;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato DD/MM/AAAA: ");
        String input = scanner.nextLine();

        if(Validator.validator(input))
        {
            System.out.println("Data válida.");
        } else

        {
            System.out.println("Data inválida.");
        }

    }

}
