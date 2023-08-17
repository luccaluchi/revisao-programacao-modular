package com.lucca.lista_revisao.questoes.questao12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File {

    public static ArrayList<String> input() {

        ArrayList<String> input = new ArrayList<>();
        String path = "src/com/lucca/lista_revisao/questoes/questao12/input.txt";


        try {
            FileReader fileInput = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileInput);

            String line;
            int j = 0;
            while ((line = bufferedReader.readLine()) != null) {
                line = bufferedReader.readLine();
                input.add(j, line);
                j++;
            }
        }
        catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo" + e);
        }
        return input;
    }

}
