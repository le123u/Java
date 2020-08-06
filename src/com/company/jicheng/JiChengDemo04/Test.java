package com.company.jicheng.JiChengDemo04;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 创建若⼲SUV对象，保存到集合，遍历集合，输出中型SUV。
        // 创建SUV对象
        SUV suv1 = new SUV(5079, 750000);
        SUV suv2 = new SUV(4813, 760000);
        SUV suv3 = new SUV(4270, 127800);
        SUV suv4 = new SUV(4545, 188800);

        //添加到集合中
        ArrayList<SUV> list = new ArrayList<>();
        list.add(suv1);
        list.add(suv2);
        list.add(suv3);
        list.add(suv4);

        // 遍历集合,查询中型SUV
        for (int i = 0; i < list.size(); i++) {
            SUV suv = list.get(i);
            if (suv.midSUV()) {
                suv.showMsg();
            }
        }

    }

}


