package com.company.revise.sum.PokerBox;

import java.util.ArrayList;
import java.util.Collections;

public class PokerBoxDemo01 {
    public static void main(String[] args) {
        ArrayList<String> box = new ArrayList<>();

        ArrayList<String> number = new ArrayList<>();
        for (int i = 2; i <= 10 ; i++) {
            number.add(i+"");
        }
        number.add("A");
        number.add("J");
        number.add("Q");
        number.add("K");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♣");
        colors.add("♠");

        for(String color:colors){
            for(String num:number){
                box.add(color+num);
            }
        }

        box.add("大王");
        box.add("小王");

        Collections.shuffle(box);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();


        for (int i = 0; i < box.size(); i++) {
            String s = box.get(i);
            if (i >= 51){
                dipai.add(s);
            }
            if (i % 3 == 0){
                p3.add(s);
            }else if(i % 3 == 1){
                p2.add(s);
            }else {
                p1.add(s);
            }
        }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(dipai);
    }
}
