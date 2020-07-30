package com.company.D12.homework;

public class Demo01 {
    private char value[];
    public Demo01(char[] value) {
        this.value = value;
    }
    public boolean equals(Object anObject) {

        //跟自己进行一次比较
        if (this == anObject) {
            return true;
        }

        // 传入的anObject是否属于String类型
        if (anObject instanceof String) {

            // anObject强制转化为String类型
            Demo01 anotherString = (Demo01)anObject;

            // value.length 可以看作StringDemo01中 s1的长度
            int n = value.length;

            //anotherString.value.length 可以看作StringDemo01中 s3的长度
            if (n == anotherString.value.length) {

                //赋值
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;

                // v1和v2中的每一个元素注意比较
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}