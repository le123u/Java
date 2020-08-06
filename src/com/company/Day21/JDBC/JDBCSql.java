package com.company.Day21.JDBC;

import com.company.Day21.JDBC.demo.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCSql {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pestmt = null;
        PreparedStatement pestmt2 = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            pestmt = conn.prepareStatement(sql);
            pestmt2 = conn.prepareStatement(sql2);

            pestmt.setInt(1,500);
            pestmt.setInt(2,2);
            pestmt2.setInt(1,500);
            pestmt2.setInt(2,3);

            int count1 = pestmt.executeUpdate();
            int count2 = pestmt2.executeUpdate();

            System.out.println(count1+count2);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pestmt,conn);
            JDBCUtils.close(pestmt2,conn);
        }
    }
}
