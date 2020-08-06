package com.company.jicheng.JiChengDemo03;

/**
 * 1. 模拟教学管理系统师⽣信息。
 * 2. 定义Person类。
 *      1. 属性：姓名、年龄
 *      2. 构造⽅法：⽆参构造⽅法，有参构造⽅法
 *      3. 成员⽅法：getXxx⽅法，setXxx⽅法，显⽰基本信息showMsg⽅法
 * 3. 定义Teacher类，继承Person
 *      1. 属性：学科
 *      2. 构造⽅法：⽆参构造⽅法，有参构造⽅法
 *      3. 成员⽅法：getXxx⽅法，setXxx⽅法，讲课⽅法
 * 4. 定义Student类，继承Person
 *      1. 属性：分数
 *      2. 构造⽅法：⽆参构造⽅法，有参构造⽅法
 *      3. 成员⽅法：getXxx⽅法，setXxx⽅法，考试⽅法
 */
public class Person {
    // 1. 属性：姓名、年龄
    String name;
    int age;

    // 构造⽅法：⽆参构造⽅法，有参构造⽅法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 3. 成员⽅法：getXxx⽅法，setXxx⽅法，

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 显⽰基本信息showMsg⽅法
    public void showMsg(){
        System.out.println("显示基本信息");
    }
}
