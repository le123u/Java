package com.company.Day22.dao.Impl;

import com.company.Day21.JDBC.demo.JDBCUtils;
import com.company.Day22.dao.AdminDao;
import com.company.Day22.doMain.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminDaoImpl implements AdminDao {
    private  Connection conn = null;
    private  PreparedStatement pstmt = null;
    private ResultSet rs = null;
    @Override
    public Admin getAdminByNameByPass(String adminName, String password) {
        Admin admin = null;
       String sql = "select * from admin where adminName = ? and password = ?";

        try{
            conn = JDBCUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,adminName);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            while(rs.next()){
                admin = new Admin();
                admin.setAdminId(rs.getInt("adminId" ));
                admin.setAdminName(rs.getString("adminName" ));
                admin.setPassword(rs.getString("password" ));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }
        return admin;

    }
}
