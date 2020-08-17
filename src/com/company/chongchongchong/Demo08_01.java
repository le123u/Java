package com.company.chongchongchong;

import java.util.Scanner;

// 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
// 例如2+22+222+2222+22222(此时共有5个数相加)，
// 几个数相加有键盘控制。
public class Demo08_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入加几次：");
        int count = scanner.nextInt();
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum+num;
            num = num*10 +num;
            System.out.println(sum);
        }

    }
}
