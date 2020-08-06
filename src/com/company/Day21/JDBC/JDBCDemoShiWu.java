package com.company.Day21.JDBC;

import com.company.Day21.JDBC.demo.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemoShiWu {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        try{
            conn= JDBCUtils.getConnection();
            // 开始事务
            conn.setAutoCommit(false);
            String sql = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt.setInt(1,500);
            pstmt.setInt(2,2);
            pstmt2.setInt(1,500);
            pstmt2.setInt(2,3);

            int count = pstmt.executeUpdate();

            // 手动制造异常
            int i = 5/0;

            int count2 = pstmt2.executeUpdate();

            System.out.println("count"+count+"count2"+count2);

            // 提交事务
            conn.commit();
        } catch (Exception e) {

            // 事务进行回滚
            try{
                if (conn != null){
                    conn.rollback();
                }
            }catch (SQLException e1){
                e1.printStackTrace(); 
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
            JDBCUtils.close(pstmt2,conn);
        }
    }
}
