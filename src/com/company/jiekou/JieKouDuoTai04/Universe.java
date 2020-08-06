package com.company.jiekou.JieKouDuoTai04;

/**
 * 1. 定义接⼝Universe，提供抽象⽅法doAnything。
 * 2. 定义普通类Star，提供成员发光shine⽅法
 * 3. 定义普通类Sun，继承Star类，实现Universe接⼝
 * 4. 测试类中，创建Star对象，调⽤shine⽅法
 * 5. 测试类中，多态的⽅式创建Sun对象，调⽤doAnything⽅法，向下转型，调⽤shine⽅法。
 */
public interface Universe {

    public abstract void doAnything();
}
