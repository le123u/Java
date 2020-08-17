package com.company.Day22.dao;

import com.company.Day22.doMain.Business;

import java.util.List;

public interface BusinessDao {

    // 显示所有商家列表
    public List<Business> listBusiness(String businessName, String businessAddress);

    // 新建商家列表
    public int saveBusiness(String businessName);

    // 删除商家列表
    public int removeBusiness(int businessId);

    public Business getBusinessByNameByPass(Integer businessId, String password);

    public Business getBusinessByBusinessId(Integer businessId);

    public int updateBusiness( Business business);

    public int updateBusinessByPassword(Integer businessId,String password);

    public Business getBusinessById(Integer businessId);
}
