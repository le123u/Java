package com.company.chongchongchong;
// 题目：计算字符串中子串出现的次数

/**
 * /*分析
 * 6  * 1、子串的出现是有标志的，如" "，*，#或者其他
 * 7  * 2、统计子串的出现的次数只需要抓住关键标志
 * 8  * 3、怎么判断关键字一定是子串，一个子串可能有多个关键字
 * 9  *
 */
/*====================两种方法====================
 * 11  * 方法一：使用String类的substring(indexStart,indexEnd)方法
 * 12  * str.substring(indexStart,indexEnd)表示：
 * 13  * 截取方法调用者（即str）的从indexStart到indexEnd
 * 14  * （包括indexStart，不包括indexEnd；即含头不含尾、或左闭右开区间内的子字符串）
 * 15  * 1、count用来接收子字符串substr在字符串str中出现的次数
 * 16  * 2、使用for循环从字符串的0位置开始循环截取和子字符串长度相同的字符串；
 * 17  * 3、然后判断截取的字符串是否和子字符串substr相同，若相同则count加一。
 * 18  * 原理：利用for循环遍里所有符合子串长度的子串，如果相同，则count++
 * 19  * 方法二：使用使用String类的indexOf()方法
 * 20  * 1、indexOf(String str): 返回指定字符str在字符串中（方法调用者）第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
 * 21  * 2、indexOf(String str, int index): 返回从 index 位置开始查找指定字符str在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
 * 22  * 原理：找到第一次出现子串的位置，count++，第二次以此为起始，再找到第一次出现子串的位置，count++。。。重复之前的操作，直到字符串全部查找完毕
 * 23  * */

public class Demo49 {
    public static void main(String[] args) {
        //声明字符串
        String str = "wangyongqinwangyongqinwangyongqinwangyongqin";
        //子串
        String str_son = "wang";
        System.out.println("子串共出现了：" + Counter_2(str, str_son) + "次");
    }
    //    //子串出现次数统计的函数(方法一)
    //    private static int Counter_1(String str,String str_son) {
    //        //计数器
    //        int counter=0;
    //
    //        return counter;
    //
    //    }


    //子串出现次数统计的函数(方法二)
    private static int Counter_2(String str, String str_son) {
        //计数器
        int counter = 0;
        //从字符串起始位置开始查找
        int i = 0;
        //开始查找
        while (str.indexOf(str_son, i) != -1) {   //不等于-1意味着查找到了子串
            counter++;     //找到子串就加1
            i = str.indexOf(str_son, i) + str_son.length();  //从查到的子串结束后开始继续查找（indexOf返回的是查找到的子串的起始位置）
            //            System.err.println(str.indexOf(str_son,i)+" "+i+" "+str_son.length());//测试
        }
        return counter;
    }
}
