package com.company.jiekou.JieKouDuoTai04;

// 4. 测试类中，创建Star对象，调⽤shine⽅法
// * 5. 测试类中，多态的⽅式创建Sun对象，调⽤doAnything⽅法，向下转型，调⽤shine⽅法。
public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("=================");

       Universe universe = new Sun();
        universe.doAnything();

        Sun sun = (Sun) universe;
        sun.shine();
    }
}
