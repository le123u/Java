package com.company.chongchongchong;

// 两个乒乓球队进行比赛，各出三人。
// 甲队为a,b,c三人，乙队为x,y,z三人。
// 已抽签决定比赛名单。有人向队员打听比赛的名单。
// a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
public class Demo18 {
    public static void main(String[] args) {
        for (char a = 'x';a <= 'z';a++){
            for(char b = 'x';a <= 'z';a++){
                if (a != b){
                    for (char c = 'x';c <= 'z';c++){
                        if( b!=c && a!=c){
                            if (a != 'x'&& c != 'x' && c != 'z'){
                                System.out.println("a:"+a);
                                System.out.println("b:"+b);
                                System.out.println("c:"+c);
                            }
                        }
                    }
                }
            }
        }

    }
}
