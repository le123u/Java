package com.company.Day15.lambdaDemo;

public class Demo01 {
    public static void main(String[] args) {
        // 格式： (参数类型 参数名称) -> {代码语句}
        invoke(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("好饭不怕晚");
            }
        });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
