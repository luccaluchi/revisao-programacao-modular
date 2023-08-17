package com.lucca.lista_revisao.questoes.questao03;

import java.util.Scanner;

public class ReadCharacter {
    public static char read(){
        Scanner scanner = new Scanner(System.in);
        char character;
        System.out.println("Digite um caractere: ");
        character = scanner.next().charAt(0);
        return character;
    }
}
