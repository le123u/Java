package com.company.Day09.Day09_02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // == 基本数据类型是比较两个对象的内容 （数值和数值类型）
        int i = 2;
        int j = 2;
        char m = '2';
        System.out.println(i == j); //true
        System.out.println(m == j); //false

        // 引用数据类型中的==和equals比较的都是两个对象的地址值，
        // 如果重写了 （equals可以重写==不可以）equals方法比较的是
        // 两个对象的内容是否一致

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2));// false
        System.out.println(obj1==obj2);// false


        String a = new String("abcd");

        String b = new String("abcd");
        // abcd 放在常量池中
        String c = "abcd";

        String d = "abcd";

        if (a == b){ //false
            // 不是同一个对象
            System.out.println("a==b");
        }
        if(a.equals(b)){
            System.out.println("a == b equals");
        }
        if (c == d){
            System.out.println("c==d");
        }
        if (c.equals(d)){
            System.out.println("c == d equals");
        }







    }
}
