package com.company.jicheng.JiChengDemo01;

/**
 * 1. 定义抽象类A，抽象类B继承A，普通类C继承B
 * 2. A类中，定义成员变量numa，赋值为10，抽象showA⽅法。
 * 3. B类中，定义成员变量numb，赋值为20，抽象showB⽅法。
 * 4. C类中，定义成员变量numc，赋值为30，重写showA⽅法，打印numa，
 * 重写showB⽅法， 打印numb，定义showC⽅法，打印numc。
 * 5. 测试类中，创建C对象，调⽤showA⽅法，showB⽅法，showC⽅法。
 */
public abstract class A {
    int numa = 10;

    public abstract void showA();
}
