package com.company.Day14.lianxi01;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        // 控制台输一个字符串 统计上面字符串每个字符出现多少次
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length() ; i++) {
//            char c = str.charAt(i);
//            if (map.containsKey(c)){
//                Integer integer = map.get(c) + 1;
//                map.put(c,integer);
//            }else{
//                map.put(c,1);
//            }
//        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c,0);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer count = map.get(c);
            map.put(c,++count);
        }
        System.out.println(map);



    }
}
