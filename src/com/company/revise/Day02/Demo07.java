package com.company.revise.Day02;

public class Demo07 {
    public static void main(String[] args) {
        double width = 0.1;
        int hight = 8844430;
        int count = 0;
        while (width<=hight){
            width *= 2;
            count++;
        }
        System.out.println(count);
    }
}
