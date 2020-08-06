package com.company.Day12.Day12_01.redbag;

// 红包界面启动程序
public class Bootstrap {
    public static void main(String[] args) {
        // 设置标题
        MyRed myRed = new MyRed("抢红包");
        // 设置群主名
        myRed.setOwnerName("马云");
        // 设置分发策略
        // 普通红包
//        NormalMode normalMode = new NormalMode();
//        myRed.setOpenWay(normalMode);

        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);

    }
}
