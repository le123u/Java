package com.company.Day10.Day10_01;

import java.util.ArrayList;

public class Game {
    public static int number;
    public static ArrayList<String> list;

    // 作用：给类变量进行初始化赋值
    static{
        number = 2;
        list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
    }
}
