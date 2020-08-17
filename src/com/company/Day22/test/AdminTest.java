package com.company.Day22.test;

import com.company.Day22.dao.Impl.AdminDaoImpl;
import com.company.Day22.doMain.Admin;

public class AdminTest {
    public static void main(String[] args) {
        AdminDaoImpl adminDao = new AdminDaoImpl();
        Admin adminByNameByPass = adminDao.getAdminByNameByPass("王磊", "123");
        System.out.println(adminByNameByPass);
    }
}
