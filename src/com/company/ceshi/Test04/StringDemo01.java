package com.company.ceshi.Test04;

public class StringDemo01 {
    // 扩展  大厂面试题（重点中的重点）
    // 基本数据类型的比较 用 ==
    // 引用数据类型比较的是 地址值
    // String的equal是如何实现的
    private char value[];
    public StringDemo01(char[] value){
        this.value = value;
    }
    public boolean equals(Object anObject){
        // 自己跟自己进行一次比较
        if (this == anObject){
            return true;
        }
        // 传入的anObject是否属于String类型
        if (anObject instanceof String){
            // 将anObject强制转化成String类型
            StringDemo01 anotherString = (StringDemo01) anObject;

            int n = value.length;

            if (n == anotherString.value.length){
                // 赋值
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;

                // v1和v2中每个元素逐一比较
                while (n-- != 0){
                    if(v1[i] != v2[i]){
                        return false;
                    }
                    i++;
                }
                return true;
            }

        }
        return false;
    }
}
