package com.lucca.lista_revisao.questoes.questao05;
public class Subject {
    private String name;
    int studyHours;
    int studyMinutes;

    public Subject(String name){
        this.name = name;
    }
    public void setStudyTime(int studyHours, int studyMinutes) {
        this.studyHours = studyHours;
        this.studyMinutes = studyMinutes;
    }
    public int getStudyHours() {
        return studyHours;
    }
    public int getStudyMinutes() {
        return studyMinutes;
    }

}
