package com.company.Day13.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker03 {
    public static void main(String[] args) {

        // 扑克盒
        List<String> pokerBox = new ArrayList<>();

        // 花色和数字
        List<String> colors = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        // 添加花色
        colors.add("♥");
        colors.add("♦");
        colors.add("♣");
        colors.add("♠");

        // 添加数字
        for (int i = 2; i < 11; i++) {
            numbers.add(i + "");
        }

        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        // 拼接
        for (String color: colors) {
            for(String number : numbers){
                String s = color + number;
                pokerBox.add(s);
            }

        }
        pokerBox.add("大王");
        pokerBox.add("小王");

        // 打乱
        Collections.shuffle(pokerBox);

        // 三个成员 一个底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        // 遍历
        for (int i = 0; i < pokerBox.size(); i++) {
            String str = pokerBox.get(i);

            if (i >= 51){
                dipai.add(str);
            }else{
                if (i % 3 == 0){
                    player1.add(str);
                }else if (i % 3 == 1){
                    player2.add(str);
                }else{
                    player3.add(str);
                }
            }
        }
        System.out.println("第一个玩家的牌：" + player1);
        System.out.println("第二个玩家的牌：" + player2);
        System.out.println("第三个玩家的牌：" + player3);
        System.out.println("底牌：" + dipai);


    }
}
