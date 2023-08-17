package com.lucca.lista_revisao.questoes.questao05;

import java.util.ArrayList;
import java.util.List;

public class StudyPlan {
    private List<Subject> subjects;
    private int studyTimePerSubject;
    private int restTimePerSubject;

    public Student student;

    public StudyPlan(Student student){
        this.student = student;
        subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    public void organizeStudyPlan(int avaliableMinutes, int restTime){
        int numberOfSubjects = subjects.size();
        this.studyTimePerSubject = avaliableMinutes / numberOfSubjects;
        this.restTimePerSubject = restTime / numberOfSubjects;
    }

    public String getStudyTimePerSubject(){
        System.out.println("StudyTimePerSubject: " + studyTimePerSubject);
        System.out.println("Conv getStudyTimePerSubject: " + convertTime(studyTimePerSubject));
        return convertTime(studyTimePerSubject);
    }
    public String getRestTimePerSubject(){
        System.out.println("RestTimePerSubject: " + restTimePerSubject);
        System.out.println("Conv getRestTimePerSubject: " + convertTime(restTimePerSubject));
        return convertTime(restTimePerSubject);
    }

    private String convertTime(int time){
        int hours = 0, minutes = 0;
        if (time > 59){
            hours = time / 60;
            minutes = time % 60;
        }
        return (hours + ":" + minutes);

    }
}
