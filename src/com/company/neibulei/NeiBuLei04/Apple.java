package com.company.neibulei.NeiBuLei04;

public class Apple {
    //属性：⼤⼩，颜⾊。
    double size;
    String color;
    // 提供基本的构造⽅法和

    public Apple() {
    }

    public Apple(double size, String color) {
        this.size = size;
        this.color = color;
    }
// get⽅法，set⽅法

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return size + "-" + color;
    }
}
