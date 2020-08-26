package com.company.chongchongchong;

// 题目：809*??=800*??+9*??+1
//其中??代表的两位数,8*??的结果为两位数，
// 9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
public class Demo42 {
    public static void main(String[] args) {
        int x;
//其中??代表的两位数
        for (x = 10; x < 100; x++) {
//8*??的结果为两位数
            if ((8 * x >= 10) && (8 * x <= 99)) {
//9*??的结果为3位数
                if ((9 * x >= 100) && (9 * x <= 999)) {
                    System.out.println("神秘的两位数x：" + x);
                    int y = 809 * x;
                    int z = 800 * x + 9 * x+1;
                    System.out.println("等式左边y：" + y);
                    System.out.println("等式右边z：" + z);
                    break;
                }
            }
        }
    }
}
