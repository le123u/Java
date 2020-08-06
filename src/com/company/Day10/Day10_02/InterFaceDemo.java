package com.company.Day10.Day10_02;

public interface InterFaceDemo {

    // 抽象方法
    // public abstract void method(); //可以省略abstract

    //  默认方法和静态方法
    // 默认方法 default修饰，不可以省略，供子类调用或者子类重写
    public  default void method(){
        // 执行语句
    }
    // 静态方法 static修饰 供接口直接调用
    public static void method2(){

    }

    // 私有方法和私有静态方法
    // 供接口中的默认方法或者静态方法调用
    void method3(){

    }


}
