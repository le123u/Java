package com.company.jiekou.JieKouDuoTai02;

/**
 * 1. 定义接⼝A，普通类B实现接⼝A。
 * 2. A接⼝中，定义抽象⽅法showA。
 * 3. A接⼝中，定义私有⽅法show10（String str），循环打印10次str。
 * 4. A接⼝中，定义默认⽅法showB10，showC10，分别调⽤show10⽅法，传⼊参数。
 * 5. 测试类中，创建B对象，调⽤showA⽅法，showB10⽅法，showC10⽅法
 */
public interface A {
    public abstract void showA();

    void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.println(str + " ");

        }
        System.out.println();
    }
    // A接⼝中，定义默认⽅法showB10，showC10，分别调⽤show10⽅法，传⼊参数。
    public default void showB10(){
        show10("bbbbb");
    }
    public default void showC10(){
        show10("ccccc");
    }

}
