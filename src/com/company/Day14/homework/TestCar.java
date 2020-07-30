package com.company.Day14.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestCar {
    public static void main(String[] args) {
        // 请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
        // 并使用keySet和entrySet两种方式遍历Map集合。
        HashMap<Car, Integer> map = new HashMap<>();

        Car car1 = new Car("大众", "白色");
        Car car2 = new Car("奔驰", "粉色");

        map.put(car1,10000);
        map.put(car2,20000);

        Set<Car> cars = map.keySet();
        for(Car car:cars){
            Integer integer = map.get(car);
            System.out.println(car + "汽车"+integer+"钱");
        }

        Set<Map.Entry<Car, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Car, Integer> entry:entrySet){
            Car key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"汽车"+value+"钱");
        }
        Iterator<Map.Entry<Car, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<Car, Integer> next = iterator.next();
            System.out.println(next.getKey() + "---" + next.getValue());
        }


    }
}
