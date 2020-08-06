package com.company.neibulei.NeiBuLei04;



public class Worker {
    // 成员⽅法：挑选苹果Apple pickApple（CompareAble，Apple a1，Apple a2）。
    public Apple pickApple(CompareAble c,Apple a1,Apple a2){

        Apple compare = c.compare(a1, a2);
        return compare;
    }
}
