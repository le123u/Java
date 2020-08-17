package com.company.Day22.view;

import com.company.Day22.doMain.Business;

public interface BusinessView {
    public void listBusinessAll();
    public void listBusinessBySearch();
    public void saveBusiness();
    public void removeBusiness();

    // 添加一个商家登录的验证方法
    public Business login();
    //显示商家信息
    public void showBusinessInfo(Integer businessId);
    //修改商家信息
    public void updateBusinessInfo(Integer businessId);
    // 修改密码
    public void updateBusinessByPassword(Integer businessId);
}
