package com.company.jicheng.JiChengDemo02;

public class Duck extends Poultry {
    public Duck() {
    }

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    public void ShowSymptom() {
        System.out.println("症状为"+getSymptom());
    }
}
