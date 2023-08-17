package com.lucca.lista_revisao.questoes.questao06;

import java.util.Scanner;

/*
06 – Mensalmente, a organização de moradores do bairro faz um sorteio cujos bilhetes contêm números de 6 dígitos.
O sorteio é baseado nos dois primeiros números da loteria federal, sendo que o número vencedor no sorteio da
organização é formado pelos três primeiros dígitos do segundo prêmio e os três últimos dígitos do primeiro prêmio da
loteria federal. Por exemplo, se o primeiro prêmio fosse 34.582 e o segundo 54.098, o número vencedor seria 540.582.
Escreva um programa que leia os prêmios da loteria federal e retorna o número vencedor da organização.
 */
public class Questao_06 {
    public static void questao06(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o resultado da loteria 1:");
        int loteria1 = scanner.nextInt();
        System.out.println("Digite o resultado da loteria 2:");
        int loteria2 = scanner.nextInt();
        System.out.println(Result.result(FirstDigits.firstDigits(loteria2), SecondDigits.secondaryDigits(loteria1)));
    }
}
