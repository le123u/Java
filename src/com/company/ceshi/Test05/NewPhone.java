package com.company.ceshi.Test05;

public class NewPhone extends Phone{

    @Override
    public void showNum(){
        super.showNum();
        System.out.println("显示来电姓名");
        System.out.println("显示来电头像");
    }

}
