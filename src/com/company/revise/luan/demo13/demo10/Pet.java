package com.company.revise.luan.demo13.demo10;

public interface Pet {
    public void showYang();
    public void show();
    public  default void method(){
        System.out.println("Pet!");
    }
}
