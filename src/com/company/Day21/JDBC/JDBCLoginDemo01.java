package com.company.Day21.JDBC;

import com.company.Day21.JDBC.utils.JDBCUtilsDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCLoginDemo01 {
    public static void main(String[] args) {
        // 键盘录入 接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = sc.nextLine();
        System.out.println("请输入密码：");
        String passWord = sc.nextLine();

        boolean flag = new JDBCLoginDemo01().login(userName, passWord);
        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }

    }
    public boolean login(String userName,String passWord){

        if (userName == null || passWord == null){
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtilsDemo.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from user where userName = '"+userName+"'"+
                    "and passWord="+"'" + passWord + "'";
            rs = stmt.executeQuery(sql);

            return rs.next();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtilsDemo.close(rs,stmt,conn);
        }


        return false;
    }
}
