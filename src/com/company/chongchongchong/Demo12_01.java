package com.company.chongchongchong;

import java.util.Scanner;

// 题目：企业发放的奖金根据利润提成。
//利润(I)低于或等于10万元时，奖金可提10%；
// 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
// 高于10万元的部分，可可提成7.5%；
// 20万到40万之间时，高于20万元的部分，可提成5%；
// 40万到60万之间时高于40万元的部分，可提成3%；
// 60万到100万之间时，高于60万元的部分，可提成1.5%，
// 高于100万元时，超过100万元的部分按1%提成，从
// 键盘输入当月利润I，求应发放奖金总数？
public class Demo12_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当月利润：");
        int i = scanner.nextInt();
        int comm = 0;
        if (i/10000 <= 10){
            comm += i*0.1;
        }else if (i/10000 <= 20){
            comm += 10000+(i-100000)*0.075;
        }else if (i/10000 <= 40){
            comm += 10000+100000*0.075+(i-200000)*0.005;
        }else if(i/10000 <= 60){
            comm += 10000+100000*0.075+200000*0.005+(i - 400000)*0.03;
        }else if (i/10000 <=100){
            comm += 10000+100000*0.075+200000*0.05+200000*0.03+(i-600000)*0.015;
        }else{
            comm += 10000+100000*0.075+200000*0.05+200000*0.03+400000*0.015+(i-1000000)*0.01;
        }

        System.out.println(comm);


    }
}
