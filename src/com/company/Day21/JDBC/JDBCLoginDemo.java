package com.company.Day21.JDBC;

import com.company.Day21.JDBC.demo.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCLoginDemo {
    public static void main(String[] args) {
        // 键盘录入 接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String userName = sc.nextLine();
        System.out.println("请输入您的密码：");
        String passWord = sc.nextLine();

        boolean flag = new JDBCLoginDemo().login(userName, passWord);
        if (flag){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }

    }
    // 编写一个方法Login 判断用户用户名和密码是否输入正确
    public boolean login(String userName,String passWord){
        // 判断是否为空
        if (userName == null || passWord == null){
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "select * from user userName = " +
                    "'" +userName+ "'and passWord = '" +passWord+"'";
//            StringBuilder sql2 = new StringBuilder("select * from user userName ='")
//                    .append(userName).append("'and passWord='").append(passWord).append("'")

             stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next(); //如果有下一行 返回true

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
       return false;
    }
}
