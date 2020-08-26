package com.company.revise.Day13.demo03;

public class Auto {
    private String pinpai;
    private double chechang;
    private double price;

    public Auto() {
    }

    public Auto(String pinpai ,double chechang, double price) {

        this.pinpai = pinpai ;
        this.chechang = chechang;
        this.price = price;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public double getChechang() {
        return chechang;
    }

    public void setChechang(double chechang) {
        this.chechang = chechang;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showMsg(){
        System.out.println("车型："+pinpai);
        System.out.println("车长："+chechang);
        System.out.println("价格："+price);
    }
}
