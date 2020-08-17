package com.company.Day22;

import com.company.Day22.dao.Impl.BusinessDaoImpl;
import com.company.Day22.doMain.Admin;
import com.company.Day22.doMain.Business;
import com.company.Day22.doMain.Food;
import com.company.Day22.view.Impl.AdminViewImpl;
import com.company.Day22.view.Impl.BusinessViewImpl;
import com.company.Day22.view.Impl.FoodViewImpl;

import java.util.Scanner;

public class EmlAdmin {
    public static void main(String[] args) {
        work();
    }
    public static void work(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------");
        System.out.println("|\t\t\t\t饿了么控制台版后台管理系统 V1.0\t\t\t\t|");
        System.out.println("-----------------------------------------------------------");

        AdminViewImpl adminView = new AdminViewImpl();
        BusinessViewImpl businessView = new BusinessViewImpl();
        BusinessDaoImpl businessDao = new BusinessDaoImpl();
        FoodViewImpl foodView = new FoodViewImpl();
        Food food = new Food();
        int menu = 0;
        while(menu != 3){
            System.out.println("========= 1.用户登录=2.商家登录=3.退出饿了么系统=========");
            menu = input.nextInt();
            switch (menu){
                case 1:
                    Admin admin = adminView.login();
                    if (admin!=null){
                        int menuA=0;
                        int menuBusiness = 0;
                        int menuFood = 0;
                        System.out.println("欢迎来到饿了么管理系统");
                        while (menuA != 3){
                            System.out.println("========= 1.商家管理=2.食物管理=3.退出饿了么系统 =========");
                            menuA = input.nextInt();
                            switch(menuA){
                                case 1:
                                    System.out.println("欢迎来到商家管理");
                                    while(menuBusiness!=5){
                                        System.out.println("========= 1.所有商家列表=2.搜索商家=3.新建商家=4.删除商家=5.退出商场管理子系统 =========");
                                        System.out.println("请选择相应的菜单编号:");
                                        menuBusiness = input.nextInt();
                                        switch(menuBusiness){
                                            case 1:
                                                System.out.println("所有商家列表");
                                                businessView.listBusinessAll();
                                                break;
                                            case 2:
                                                System.out.println("搜索商家");
                                                businessView.listBusinessBySearch();
                                                break;
                                            case 3:
                                                businessView.saveBusiness();
                                                break;
                                            case 4:
                                                businessView.removeBusiness();
                                                break;
                                            case 5:
                                                System.out.println("===欢迎光临饿了么商家===");
                                                System.out.println();
                                                break;
                                            default:
                                                System.out.println("没有这个菜单项");
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    System.out.println("欢迎光临饿了么系统");
                                    break;
                                default:
                                    System.out.println("没有这个菜单项");
                                    break;

                            }
                        }
                    }else {
                        System.out.println("账号密码输入错误");
                    }
                    break;
                case 2:
                    Business business = businessView.login();
                    int menuFood = 0;
                    if(business != null){
                        System.out.println("欢迎来到商家管理系统");
                        int menuB = 0;
                        while(menuB != 5){
                            System.out.println("========= 一级菜单(商家管理) 1.查看商家信息=2.修改商家信息=3.更新密码=4.所属商品管理=5.退出系统 =========");
                            menuB = input.nextInt();
                            switch (menuB){
                                case 1:
                                    businessView.showBusinessInfo(business.getBusinessId());
                                    break;
                                case 2:
                                    businessView.updateBusinessByPassword(business.getBusinessId());
                                    break;
                                case 3:
                                    businessView.updateBusinessByPassword(business.getBusinessId());
                                    break;
                                case 4:
                                    System.out.println("欢迎来到饿了么食物管理子系统");
                                    while (menuFood != 5){
                                        System.out.println("========= 二级菜单(食品管理) 1.所有食物列表=2.搜索食物=3.新建食物=4.删除食物=5.返回一级菜单 =========");
                                        System.out.println("请选择相应的菜单编号:");
                                        menuFood = input.nextInt();
                                        switch (menuFood){
                                            case 1:
                                                foodView.showFoodList(business.getBusinessId());
                                                break;
                                            case 2:
                                                foodView.saveFood(business.getBusinessId());
                                                break;
                                            case 3:
                                                foodView.updateFood(business.getBusinessId());
                                                break;
                                            case 4:
                                                foodView.removeFood(food.getFoodId());
                                                break;
                                            case 5:
                                                System.out.println("====欢迎光临饿了么食物菜单====");
                                                System.out.println();
                                                break;
                                            default:
                                                System.out.println("没有这个菜单项");
                                                break;
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("欢迎光临商品管理系统");
                                    break;
                                default:
                                    System.out.println("编号不存在");
                            }
                        }
                    }else {
                        System.out.println("账号或密码错误请重新输入：");
                    }
                    break;
                case 3:
                    System.out.println("欢迎光临");
                    break;
                default:
                    System.out.println("编号不存在");
            }
        }

    }

}


