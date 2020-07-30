package com.company.Day15.ExceptionDemo;

import java.io.FileNotFoundException;

public class Demo04 {
    public static void main(String[] args) {
        try{
            read("xiaomimi.txt");
        } catch (Exception e) {
            // 在try中抛出什么异常 在括号中就捕获什么类型异常
            e.printStackTrace();
            System.out.println("----------------");
            System.out.println(e);
        }finally{
            System.out.println("不管try和catch执行啥了，我这里都会执行");
            System.out.println("我是接盘侠");
        }
        System.out.println("end");
    }

    public static void read(String path) throws FileNotFoundException {
        if (! path.equals("xiaomimi.tex1")){
            throw new FileNotFoundException("你的文件消失了");
        }
    }
}
