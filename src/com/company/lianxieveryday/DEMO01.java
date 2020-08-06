package com.company.lianxieveryday;

import java.util.ArrayList;
import java.util.Collections;

public class DEMO01 {
    public static void main(String[] args) {
        ArrayList<String> pokerBox = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        colors.add("♥");
        colors.add("♦");
        colors.add("♣");
        colors.add("♠");

        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");

        }
        numbers.add("A");
        numbers.add("K");
        numbers.add("Q");
        numbers.add("J");

        for (String color:colors){
            for(String number:numbers){
                String s = color + number;
                pokerBox.add(s);
            }
        }

        pokerBox.add("大王");
        pokerBox.add("小王");

        Collections.shuffle(pokerBox);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();


        for (int i = 0; i < pokerBox.size(); i++) {
            String s = pokerBox.get(i);

            if (i >= 51){
                dipai.add(s);

            }else if (i % 3 == 0){
                player1.add(s);
            }else if (i % 3 == 1){
                player2.add(s);
            }else {
                player3.add(s);
            }
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
