package com.company.jicheng.JiChengDemo04;

public class SUV extends Auto {
    // 属性：⼩型⻋⻋⻓标准值：4295，中型⻋⻋⻓标准值：5070。

    private int miniLength = 4295;
    private int midLength = 5070;

    /**
     * 2. 定义判断⻋型⽅法
     * 1. 判断⼩型⻋：⼩于⼩型⻋⻋⻓标准值
     * 2. 判断⼤型⻋：⼤于中型⻋⻋⻓标准值
     * 3. 判断中型⻋：⼤于⼩型⻋⻋⻓标准值并且⼩于等于中型⻋⻋⻓标准值
     */
    public SUV(double length, double price) {
        super("SUV", length, price);
    }

    // 判断 小型车
    public boolean miniSUV() {
        return getLength() <= miniLength;
    }

    // 判断 大型车
    public boolean largeSUV() {
        return getLength() > midLength;
    }

    // 判断 中型车
    public boolean midSUV() {
        return getLength() > miniLength && getLength() <= midLength;
    }
}
