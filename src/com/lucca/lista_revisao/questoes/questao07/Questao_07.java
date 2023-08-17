/*

07 - Um algoritmo para multiplicação rápida por 11 de números de 2 dígitos funciona
assim: para multiplicar 81 x 11, some os dígitos do número (8 + 1 = 9) e insira o resultado
entre os dígitos (891). Se a soma der maior que 9, incremente o dígito da esquerda (vai-um):
56 x 11 = 616. Escreva um programa que efetue multiplicações por 11 usando este algoritmo.

 */
package com.lucca.lista_revisao.questoes.questao07;

import java.util.Scanner;

public class Questao_07 {

    public static void questao07(){
        int input, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        input = scanner.nextInt();
        result = SumNumbers.sumNumbers(input);
        System.out.println(result);
    }
}
