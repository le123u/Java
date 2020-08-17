package com.company.chongchongchong;
//一球从100米高度自由落下，每次落地后反跳回原高度的一半；
// 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
public class Demo10_01 {
    public static void main(String[] args) {
        int hight = 100;
        int length = 0;
        for (int i = 1; i <= 9; i++) {
            length = length + hight;
            hight = hight / 2;

        }
        System.out.println(hight);
        System.out.println(length);
    }
}
