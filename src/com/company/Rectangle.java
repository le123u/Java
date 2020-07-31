package com.company;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(){

    }
    public Rectangle(int length,int width,String color){

        super(color);
        this.length =length;
        this.width = width;

    }
    @Override
    public double getArea() {
        return(width*length);

    }

    @Override
    public double getPer() {
        return (width + length)*2;

    }

    @Override
    public void showAll() {
        System.out.println("矩形的面积是："+getArea()+"\n"+"矩形的周长是："+getPer());

    }


}
