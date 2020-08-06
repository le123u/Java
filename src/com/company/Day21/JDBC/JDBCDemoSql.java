package com.company.Day21.JDBC;

import com.company.Day21.JDBC.demo.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemoSql {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        try{
            conn= JDBCUtils.getConnection();
            String sql = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt.setInt(1,500);
            pstmt.setInt(2,2);
            pstmt2.setInt(1,500);
            pstmt2.setInt(2,3);

            int count = pstmt.executeUpdate();
            int count2 = pstmt2.executeUpdate();

            System.out.println("count"+count+"count2"+count2);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
            JDBCUtils.close(pstmt2,conn);
        }
    }
}
