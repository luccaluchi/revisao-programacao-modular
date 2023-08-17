package com.lucca.lista_revisao.questoes.questao09;

public class ZellerAlgorithm {

    public static String calculateDayOfWeek(String dateStr){

        String[] parts = dateStr.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int dayOfWeek = (day + 13*(month + 1) / 5 + k + k/4 + j/4 + 5*j) % 7;

        String[] daysOfWeek = { "Sábado", "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" };

        return daysOfWeek[dayOfWeek];
    }
}
