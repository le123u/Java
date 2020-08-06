package com.company.jicheng.JiChengDemo02;

/**
 * 1. 模拟农学院动物医疗系统信息。
 * 2. 定义抽象家禽类(Poultry)
 *      1. 私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
 *      2. 提供空参和带参构造⽅法
 *      3. 成员⽅法：
 *          1. 抽象⽅法症状(showSymptom)
 *          2. 普通⽅法基本信息(showMsg
 *          3. 提供setXxx和getXxx⽅法
 *  3. 定义普通鸭⼦类(Duck)
 *      1. 提供空参和带参构造⽅法
 *      2. 重写showSymptom⽅法，打印症状信息。
 */
public abstract class Poultry {
    // 1. 私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
    private String name;
    private String symptom;
    private int age;
    private String illness;

    // 2. 提供空参和带参构造⽅法
    // 空参
    public Poultry() {
        super();
    }
    // 有参
    public Poultry(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    //3. 成员⽅法：
    // *          1. 抽象⽅法症状(showSymptom)
    public abstract void ShowSymptom();
    // *          2. 普通⽅法基本信息(showMsg
    public void showMsg(){
        System.out.print("动物种类:" + name);
        System.out.println(",年龄:" + age + "岁");
        System.out.println("入院原因:" + illness);

    }
    // *          3. 提供setXxx和getXxx⽅法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
