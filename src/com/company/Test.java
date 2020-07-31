package com.company;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        Rectangle rectangle = new Rectangle(1,2,"蓝色");
        Circle circle = new Circle(1.2,"红色");
        shapes[0] = rectangle;
        shapes[1] = circle;
        for (Shape shape:shapes){
            shape.showAll();
        }

    }
}
