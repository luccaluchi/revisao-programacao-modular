package com.lucca.lista_revisao.questoes.questao05;
public class Student {

    private String name;
    private int hoursOfStudy;
    private int minutesOfStudy;
    private int hoursOfRest;
    private int minutesOfRest;

    public Student(String name){
        this.name = name;
    }

    public void  setAvalaliableTime(int hoursOfStudy, int minutesOfStudy){
        this.hoursOfStudy = hoursOfStudy;
        this.minutesOfStudy = minutesOfStudy;
    }

    public void  setRestTime(int hoursOfRest, int minutesOfRest){
        this.hoursOfRest = hoursOfRest;
        this.minutesOfRest = minutesOfRest;
    }

    public int getAvaliableTime(){
        return (hoursOfStudy * 60) + minutesOfStudy;
    }
     public int getRestTime(){
        return (hoursOfRest * 60) + minutesOfRest;
     }

     public String getName(){
        return name;
     }
}
