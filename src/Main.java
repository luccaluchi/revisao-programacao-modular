import com.lucca.lista_revisao.questoes.questao01.Questao_01;
import com.lucca.lista_revisao.questoes.questao02.Questao_02;
import com.lucca.lista_revisao.questoes.questao03.Questao_03;
import com.lucca.lista_revisao.questoes.questao04.Questao_04;
import com.lucca.lista_revisao.questoes.questao05.Questao_05;
import com.lucca.lista_revisao.questoes.questao06.Questao_06;
import com.lucca.lista_revisao.questoes.questao07.Questao_07;
import com.lucca.lista_revisao.questoes.questao08.Questao_08;
import com.lucca.lista_revisao.questoes.questao09.Questao_09;
import com.lucca.lista_revisao.questoes.questao10.Questao_10;
import com.lucca.lista_revisao.questoes.questao11.Questao_11;
import com.lucca.lista_revisao.questoes.questao12.Questao_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Digite o número da questão desejada ('0' para sair)");
        opcao = scanner.nextInt();

        if (opcao != 0) {
            while (opcao != 0) {
                switch (opcao) {
                    case 1 -> Questao_01.questao01();
                    case 2 -> Questao_02.questao02();
                    case 3 -> Questao_03.questao03();
                    case 4 -> Questao_04.questao04();
                    case 5 -> Questao_05.questao05();
                    case 6 -> Questao_06.questao06();
                    case 7 -> Questao_07.questao07();
                    case 8 -> Questao_08.questa08();
                    case 9 -> Questao_09.questao09();
                    case 10 -> Questao_10.questao10();
                    case 11 -> Questao_11.questao11();
                    case 12 -> Questao_12.questao12();
                    default -> System.out.println("Opção inválida! Digite '0', '1' ou '2'.");
                }
                System.out.println();
                System.out.println("Digite o número da questão desejada( '0' para sair)");
                opcao = scanner.nextInt();
            }
        }
    }
}