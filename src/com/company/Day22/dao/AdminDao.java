package com.company.Day22.dao;

import com.company.Day22.doMain.Admin;

public interface AdminDao {

    public Admin getAdminByNameByPass(String adminName, String password);

}
