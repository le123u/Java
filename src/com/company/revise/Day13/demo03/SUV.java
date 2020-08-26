package com.company.revise.Day13.demo03;



public class SUV extends Auto {

    private double small = 4295.0;
    private double max = 5070.0;

    public SUV() {
    }

    public SUV(double chechang,double price){
        super("SUV",chechang,price);

    }

    public boolean small(){
        return getChechang() <= small;
    }
    public boolean mid(){
        return getChechang() > small && getChechang() < max;
    }
    public boolean max(){
        return getChechang() > max;
    }

}
