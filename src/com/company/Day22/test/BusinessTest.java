package com.company.Day22.test;

import com.company.Day22.dao.Impl.BusinessDaoImpl;

public class BusinessTest {
    public static void main(String[] args) {
        BusinessDaoImpl businessDao = new BusinessDaoImpl();
        businessDao.listBusiness(null,"沈阳");

    }
}
