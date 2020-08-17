package com.company.revise.Day09.demo04;

public class SystemClassTest02 {
    public static void main(String[] args)  {
        try{long l = System.currentTimeMillis();
            System.out.println(l);
            Thread.sleep(3000);
            long ll = System.currentTimeMillis();
            System.out.println(ll);
            System.out.println(ll - l);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
