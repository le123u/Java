package com.company.Day14.lianxi01;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();
        findChar(line);

    }
    public static void findChar(String line){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else{
                // 先获取原来出现的次数
                Integer count = map.get(c);
                map.put(c,++count);
            }
        }
        System.out.println(map);
    }
}
