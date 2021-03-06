package com.company.Day13.StringBuilder;

public class TestStringBuilder01 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = builder.append("hello");
        System.out.println("builder = "+ builder); // builder = hello
        System.out.println("builder1 = "+ builder1); // builder1 = hello
        System.out.println(builder == builder1); // true

        // 可以添加任何类型
        builder.append("hhhh");
        builder.append("world");
        builder.append(true);
        builder.append(1000);

        // 在我们开发中 会遇到调用一个方法后 返回一个对象的情况
        // 然后使用返回的对象继续调用方法
        // 这种我们可以使用链式编程的方式
        builder.append("haha").append("HAHA").append(true).append(1212);
        System.out.println("builder = "+ builder);
        // builder = hellohhhhworldtrue1000hahaHAHAtrue1212
    }
}
