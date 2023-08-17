package com.lucca.lista_revisao.questoes.questao09;

public class DateValidator {
    public static boolean validator(String dateStr) {
        try {
            String[] parts = dateStr.split("/");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if (year < 1) {
                System.out.println("Ano inválido.");
                return false;
            }

            if (month < 1 || month > 12) {
                System.out.println("Mês inválido.");
                return false;
            }

            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day < 1 || day > 29) {
                        System.out.println("Dia inválido em ano bissexto.");
                        return false;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        System.out.println("Dia inválido em ano não bissexto.");
                        return false;
                    }
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day < 1 || day > 30) {
                    System.out.println("Dia inválido.");
                    return false;
                }
            } else {
                if (day < 1 || day > 31) {
                    System.out.println("Dia inválido.");
                    return false;
                }
            }

            return true;

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Formato inválido. Use DD/MM/AAAA.");
            return false;
        }
    }

}
