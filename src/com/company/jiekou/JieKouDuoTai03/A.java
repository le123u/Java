package com.company.jiekou.JieKouDuoTai03;

/**
 * 1. 定义接⼝A，普通类B实现接⼝A。
 * 2. A接⼝中，定义抽象⽅法showA。
 * 3. A接⼝中，定义私有静态⽅法show10（String str），循环打印10次str。
 * 4. A接⼝中，定义静态⽅法showB10，showC10，分别调⽤show10⽅法，传⼊参数。
 * 5. B类中，定义静态⽅法showD
 * 6. 测试类中，使⽤A接⼝，调⽤静态showB10⽅法，showC10⽅法，
 * 7. 测试类中，使⽤B类，调⽤showA⽅法，showD⽅法。
 */
public interface A {

    public abstract void showA();

    static void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.println(str+" ");
        }
        System.out.println();
    }

    public static void showB10(){
        System.out.println("static BBB");
        show10("BBBBBBBB");
    }
    public static void showC10(){
        System.out.println("static CCC");
        show10("CCCCCCCC");
    }
}
