package com.company.Day22.view.Impl;

import com.company.Day22.dao.Impl.BusinessDaoImpl;
import com.company.Day22.doMain.Business;
import com.company.Day22.view.BusinessView;

import java.util.List;
import java.util.Scanner;

public class BusinessViewImpl implements BusinessView {
    Scanner input = new Scanner(System.in);

    @Override
    public void listBusinessAll() {

        BusinessDaoImpl dao = new BusinessDaoImpl();
        List<Business> list = dao.listBusiness(null, null);
        System.out.println("商家编号\t商家密码\t商家名称\t商家地址\t商家介绍\t起送费\t配送费");
        for (Business b :list){
            System.out.println(b.getBusinessId()+"\t"+b.getPassword()+"\t"+b.getBusinessName()+"\t"+b.getBusinessAddress()+"\t"+b.getBusinessExplain()+"\t"+b.getStarPrice()+"\t"+b.getDeliveryPrice());
        }
    }

    @Override
    public void listBusinessBySearch() {
        System.out.println("是否需要输入商家关键词（y/n）");
        String bn = input.next();
        if (bn.equals("y")){
            System.out.println("请输入商家关键词：");
            String buNa = input.next();
        }
        System.out.println("是否输入商家地址关键字（y/n）");
        String ba = input.next();
        if (ba.equals("y")){
            System.out.println("请输入商家地址关键字：");
            String buAd = input.next();
        }
        BusinessDaoImpl dao = new BusinessDaoImpl();
        List<Business> list = dao.listBusiness(null, null);
        System.out.println("商家编号\t商家密码\t商家名称\t商家地址\t商家介绍\t起送费\t配送费");
        for (Business b :list){
            System.out.println(b.getBusinessId()+"\t"+b.getPassword()+"\t"+b.getBusinessName()+"\t"+b.getBusinessAddress()+"\t"+b.getBusinessExplain()+"\t"+b.getStarPrice()+"\t"+b.getDeliveryPrice());
        }

    }

    @Override
    public void saveBusiness() {
        System.out.println("请输入商家名字：");
        String businessName = input.next();

        BusinessDaoImpl dao = new BusinessDaoImpl();
        int businessId = dao.saveBusiness(businessName);
        if (businessId > 0){
            System.out.println("新建商家成功，商家编号为："+businessId);
        }else{
            System.out.println("新建商家失败");
        }

    }

    @Override
    public void removeBusiness() {
        System.out.println("请输入商家编号:");
        int businessId = input.nextInt();
        BusinessDaoImpl dao = new BusinessDaoImpl();
        System.out.println("确定要删除吗（y/n）");
        String s = input.next();
        if (s.equals("y")){
            int i = dao.removeBusiness(businessId);
            if (i == 1){
                System.out.println("删除商家成功");
            }else{
                System.out.println("删除商家失败");
            }
        }

    }

    @Override
    public Business login() {
        System.out.println("请输入商家编号：");
        int businessId = input.nextInt();
        System.out.println("请输入密码：");
        String password = input.next();
        BusinessDaoImpl dao = new BusinessDaoImpl();
        Business businessByNameByPass = dao.getBusinessByNameByPass(businessId, password);
        return businessByNameByPass;
    }

    @Override
    public void showBusinessInfo(Integer businessId) {
        BusinessDaoImpl dao = new BusinessDaoImpl();
        Business business = dao.getBusinessByBusinessId(businessId);
        System.out.println(business);

    }

    @Override
    public void updateBusinessInfo(Integer businessId) {
        BusinessDaoImpl dao = new BusinessDaoImpl();
        Business business = dao.getBusinessByBusinessId(businessId);
        // 先查看一遍商家信息 方便修改
        String inputStr;
        System.out.println(business);
        System.out.println("是否修改商家名称（y/n）");
        inputStr = input.next();
        if (inputStr.equals("y")){
            System.out.println("请输入新的商家名称");
            business.setBusinessName(input.next());
        }

        System.out.println("是否修改商家地址(y/n)：");
        inputStr = input.next();
        if(inputStr.equals("y")) {
            System.out.println("请输入新的商家地址：");
            business.setBusinessAddress(input.next());
        }

        System.out.println("是否修改商家介绍(y/n)：");
        inputStr = input.next();
        if(inputStr.equals("y")) {
            System.out.println("请输入新的商家介绍：");
            business.setBusinessExplain(input.next());
        }

        System.out.println("是否修改起送费(y/n)：");
        inputStr = input.next();
        if(inputStr.equals("y")) {
            System.out.println("请输入新的起送费：");
            business.setStarPrice(input.nextDouble());
        }

        System.out.println("是否修改配送费(y/n)：");
        inputStr = input.next();
        if(inputStr.equals("y")) {
            System.out.println("请输入新的配送费：");
            business.setDeliveryPrice(input.nextDouble());
        }

        // dao.updateBusiness(business);
        int res = dao.updateBusiness(business);
        if(res > 0)
            System.out.println("修改商家信息成功");
        else
            System.out.println("修改商家信息失败");
}

    @Override
    public void updateBusinessByPassword(Integer businessId) {
        BusinessDaoImpl dao = new BusinessDaoImpl();
        Business business = dao.getBusinessById(businessId);
        System.out.println("\n请输入旧密码：");
        String oldPass = input.next();
        System.out.println("\n请输入新密码：");
        String password = input.next();
        System.out.println("\n请再次输入新密码：");
        String beginPassword = input.next();

        if(!business.getPassword().equals(oldPass)) {
            System.out.println("\n旧密码输入错误！");
        }else if(!password.equals(beginPassword)) {
            System.out.println("\n两次输入密码不一致！");
        }else {
            int result = dao.updateBusinessByPassword(businessId, password);
            if(result>0) {
                System.out.println("\n修改密码成功！");
            }else {
                System.out.println("\n修改密码失败！");
            }
        }


    }

}
