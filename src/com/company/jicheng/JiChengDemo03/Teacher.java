package com.company.jicheng.JiChengDemo03;

/**
 * 定义Teacher类，继承Person
 *  *      1. 属性：学科
 *  *      2. 构造⽅法：⽆参构造⽅法，有参构造⽅法
 *  *      3. 成员⽅法：getXxx⽅法，setXxx⽅法，讲课⽅法
 */
public class Teacher extends Person {
    //1. 属性：学科
    String object;
    // 2. 构造⽅法：⽆参构造⽅法，有参构造⽅法
    public Teacher(){

    }
    public  Teacher(String name,int age,String object){
        super(name,age);
        this.object = object;
    }

    // 3. 成员⽅法：getXxx⽅法，setXxx⽅法，

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    // 讲课⽅法
    public void showTeacher(){
        System.out.println(getName() +"老师,讲授"+object +"课");
    }
}
