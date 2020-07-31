package com.company.zhouce;

public class Circle extends Shape {

    private double radius;

    public Circle(){

    }
    public Circle(double radius,String color){
        super(color);
        this.radius =radius;
    }
    @Override
    public double getArea() {

        return(Math.PI*radius*radius);
    }

    @Override
    public double getPer() {

        return (2*Math.PI*radius);
    }

    @Override
    public void showAll() {
        System.out.println("圆形的面积是："+getArea()+"\n"+"圆形的周长是："+getPer());

    }
}
