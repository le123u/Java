package com.company.Day10.Day10_01;

public class Test_Dy {
    public static void main(String[] args) {
//        // 使用多态方式
//       Animal a1 =  new Cat();
//       a1.eat();
//       // 执行的是子类重写的方法
//       Animal a2 = new Dog();
//       a2.eat();
        Animal a = new Cat(); // 向上转型
        a.eat();

        Cat c = (Cat) a; // 向下转型
        c.catchaMouse();

        Animal b = new Dog();
        b.eat();
        Dog d = (Dog) b;
        d.watchHouse();

        // 为了避免转型发生异常，最好先做个判断
        // 变量名 instanceof 数据类型

    }

    public static void showCatEat(Cat cat){
        cat.eat();
    }
    public static void showDogEat(Dog dog){
        dog.eat();
    }
    public static void showAnimalEat(Animal animal){
        animal.eat();
    }
}
