package com.company.neibulei.NeiBuLei02;

public class Student {
    /**
     * 定义学⽣类：
     * 属性：姓名，出勤。
     * 提供基本的构造⽅法和get⽅法，set⽅法。
     */

    private String name;
    private boolean come;

    public Student() {
    }

    public Student(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public boolean isCome() {
        return come;
    }
    public void setCome(boolean come) {
        this.come = come;
    }


}
