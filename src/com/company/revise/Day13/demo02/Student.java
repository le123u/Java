package com.company.revise.Day13.demo02;

public class Student extends Person{
    private int score;

   public Student(){}
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void showScore(){
        System.out.println(getName()+"同学，获得"+score+"分");

    }
}
