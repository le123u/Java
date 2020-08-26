package com.company.revise.Day13.demo03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 创建SUV对象                
        SUV suv1 = new SUV(5079.0, 750000.0);
         SUV suv2 = new SUV(4813.0, 760000.0);
        SUV suv3 = new SUV(4270.0, 127800.0);
        SUV suv4 = new SUV(4545.0, 188800.0);
        //添加到集合中                
         ArrayList<SUV> list = new ArrayList<>();
         list.add(suv1);
         list.add(suv2);
         list.add(suv3);
         list.add(suv4);

         // 遍历集合,查询中型SUV
         for (int i = 0; i < list.size(); i++) {
            SUV suv = list.get(i);
            if (suv.mid()){
                suv.showMsg();
            }
         }

    }
}
