package com.company.neibulei.NeiBuLei02;

import java.util.ArrayList;

public class Teacher {
    /**
     * 属性：姓名。
     * 提供基本的构造⽅法和get⽅法，set⽅法
     * 成员⽅法：点名⽅法，设置每⼀位的学⽣出勤情况。假设，⼩明今⽇未出勤。
     */

    private String name;



    public Teacher(String name) {
        this.name = name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void dianMing(ArrayList<Student> slist) {
        for (int i = 0; i < slist.size(); i++) {
            Student student = slist.get(i);
            if (!student.getName().equals("小明")) {
                student.setCome(true);
            }
        }
    }

    public String getName() {
        return name;
    }
}
