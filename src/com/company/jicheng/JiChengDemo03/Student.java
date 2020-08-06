package com.company.jicheng.JiChengDemo03;

/**
 * 4. 定义Student类，继承Person
 *  *      1. 属性：分数
 *  *      2. 构造⽅法：⽆参构造⽅法，有参构造⽅法
 *  *      3. 成员⽅法：getXxx⽅法，setXxx⽅法，考试⽅法
 */
public class Student extends Person{
    //  1. 属性：分数
    int score;
    //  2. 构造⽅法：⽆参构造⽅法，有参构造⽅法
    public Student(){

        super();
    }
    public  Student(String name,int age,int score){
        super(name,age);
        this.score = score;
    }
    //3. 成员⽅法：getXxx⽅法，setXxx⽅法，

    public int getScore() {

        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // 考试⽅法
    public void method(){
        System.out.println(getName()+"同学,考试得了:"+ score +"分");
    }
}
