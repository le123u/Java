package com.company.revise.Day12;

public class MyGenericCMethod {

    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }
}
