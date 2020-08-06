package com.company.jiekou.JieKouDuoTai01;

/**
 * 1. 定义接⼝A，普通类B实现接⼝A
 * 2. A接⼝中，定义抽象⽅法showA。
 * 3. A接⼝中，定义默认⽅法showB。
 * 4. B类中，重写showA⽅法
 * 5. 测试类中，创建B类对象，调⽤showA⽅法，showB⽅法。
 */
public interface A {
    public abstract void showA();

    public default void showB(){
        System.out.println("BBBB");
    }
}
