/*02 - Escreva códigos Java que leiam um vetor de inteiros e criem outro vetor, contendo a soma de cada par de
vizinhos do vetor original. Por exemplo, se o vetor original era 4-8-15-16-23-42, o retorno deve ser um vetor 12-31-65
(ou seja, 4+8, 15+16 e 23+42). Caso o vetor tenha tamanho ímpar, o último número deve ser somado consigo mesmo.
Para ler o vetor, pode aproveitar o método do exercício 02. Escreva um programa que execute e teste seu código..
 */

package com.lucca.lista_revisao.questoes.questao02;

// {4, 8, 15, 16, 23, 42};
public class Questao_02 {

    public static void questao02(){
        int[] soma;
        int[] entrada = Input.input();
        soma = VectorSum.sum(entrada);
        for (int num : soma){
            System.out.println(num);
        }


    }



}
