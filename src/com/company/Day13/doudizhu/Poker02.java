package com.company.Day13.doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Poker02 {
    public static void main(String[] args) {
        // 扑克盒
        List<String> pokerBox = new ArrayList<>();

        // 花色和数字集合
        List<String> colors = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        colors.add("♥");
        colors.add("♦");
        colors.add("♣");
        colors.add("♠");

        for (int i = 2; i < 11 ; i++) {
            numbers.add("" + i);

        }

        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");

        for (String color:colors) {
            for (String number:numbers) {
                String card = color + number;
                pokerBox.add(card);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");

        // 洗牌
        Collections.shuffle(pokerBox);

        // 发牌
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> dipai = new ArrayList<>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card1 = pokerBox.get(i);

            if (i >= 51){
                dipai.add(card1);
            }else{
                if (i % 3 == 0){
                    player1.add(card1);
                }else if (i % 3 == 1){
                    player2.add(card1);
                }else{
                    player3.add(card1);
                }
            }
        }
        // look look 看牌
        System.out.println("玩家一："+player1);
        System.out.println("玩家二："+player2);
        System.out.println("玩家三："+player3);
        System.out.println("底牌："+dipai);

    }
}
