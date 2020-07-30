package com.company.Day14.MapversionDoudizhu;

import java.lang.reflect.Array;
import java.util.*;

public class Poker02 {
    public static void main(String[] args) {
        // 创建一个map集合 存储 序号和牌
        HashMap<Integer, String> map = new HashMap<>();

        // 导入花色和数字
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♣","♠");
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(numbers,"3","4","5","6","7"
                ,"8","9","10","J","Q","K","A","2");

        int count = 1;
        // 拼接
        for(String number : numbers){
            for (String color:colors){
                String s = color + number;
                map.put(count++,s);
            }
        }
        map.put(count++,"大王");
        map.put(count++,"小王");

        // 打乱
        Set<Integer> keySet = map.keySet();
        List<Integer> list = new ArrayList<>();
        list.addAll(keySet);
        Collections.shuffle(list);

//        System.out.println(list);

        // 建立四个玩家序号的集合
        ArrayList<Integer > noP1 = new ArrayList<>();
        ArrayList<Integer > noP2 = new ArrayList<>();
        ArrayList<Integer > noP3 = new ArrayList<>();
        ArrayList<Integer > noDiPai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i >= 51){
                noDiPai.add(list.get(i));
            }else if(i % 3 == 0){
                noP1.add(list.get(i));
            }else if(i % 3 == 1){
                noP2.add(list.get(i));
            }else{
                noP3.add(list.get(i));
            }
        }

        // 对这些进行排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(noDiPai);

        // 创建三个玩家 和 一个底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (Integer a :noP1){
            player1.add(map.get(a));
        }
        for (Integer b :noP2){
            player3.add(map.get(b));
        }
        for (Integer c :noP3){
            player2.add(map.get(c));
        }
        for (Integer d :noDiPai){
            dipai.add(map.get(d));
        }

        System.out.println("玩家一的牌是：" + player1);
        System.out.println("玩家二的牌是：" + player2);
        System.out.println("玩家三的牌是：" + player3);
        System.out.println("底牌是：" + dipai);
    }
}
