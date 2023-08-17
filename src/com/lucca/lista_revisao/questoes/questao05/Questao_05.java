/*
05 – Um estudante muito organizado está matriculado em N disciplinas, e dispõe de um total semanal de H horas e M minutos para estudar.
Sua intenção é dividir o tempo disponível igualmente para as N disciplinas, e distribuir o tempo de descanso que sobrar nas pausas entre as disciplinas.
Crie um ou mais métodos para informar ao estudante como ele deve organizar seu plano de estudos.
*/

package com.lucca.lista_revisao.questoes.questao05;

import java.util.Scanner;

public class Questao_05 {
    public static void questao05() {

        Scanner scanner = new Scanner(System.in);
        String studentName;
        String input = "";
        int i = 1;

        System.out.println("Digite seu nome: ");
        studentName = scanner.nextLine();
        System.out.print("Informe a quantidade de horas de estudo que você tem disponível: ");
        int studyHours = scanner.nextInt();
        System.out.print("Informe a quantidade de minutos de estudo que você tem disponível: ");
        int studyMinutes = scanner.nextInt();

        System.out.print("Informe a quantidade de horas de descanso: ");
        int restHours = scanner.nextInt();
        System.out.print("Informe a quantidade de minutos de descanso: ");
        int restMinutes = scanner.nextInt();

        Student student = new Student(studentName);
        student.setAvalaliableTime(studyHours, studyMinutes);
        student.setRestTime(restHours, restMinutes);

        StudyPlan studyPlan = new StudyPlan(student);
        System.out.println("Aluno: " + student.getName() + ", Dispovível: " + student.getAvaliableTime() + ", Descansando: " + student.getRestTime());

        scanner.nextLine();


        while (true) {

            System.out.print("Informe o nome da disciplina " + i + ": (digite '0' para parar)");
            input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            studyPlan.addSubject(new Subject(input));
            i++;


        }


        studyPlan.organizeStudyPlan(student.getAvaliableTime(), student.getRestTime());

        System.out.println("O tempo de estudo pára cada disciplina deve ser de: " + studyPlan.getStudyTimePerSubject() + " e o tempo de descanso entre cada disciplina deve ser de: " + studyPlan.getRestTimePerSubject());
    }


}
