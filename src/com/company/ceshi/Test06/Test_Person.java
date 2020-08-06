package com.company.ceshi.Test06;

public class Test_Person {
    public static void main(String[] args) {
        // 创建外部类对象
        Person person = new Person();

        // 创建内部类对象
        // 格式：外部类名.内部类名 对象名  =  new 外部类型（）.new内部类型（）
        // Person.Heart heart = new Person().new Heart();
        Person p = new Person();
        Person.Heart heart = p.new Heart();

        // 调用内部类方法
        heart.jump();

        // 调用外部类方法
        boolean live = p.isLive();
        System.out.println(live);
        p.setLive(false);

        heart.jump();
    }
}
