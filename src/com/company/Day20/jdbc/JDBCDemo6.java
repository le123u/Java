package com.company.Day20.jdbc;

import java.sql.*;

public class JDBCDemo6 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/java9",
                   "root", "root");System.out.println(conn);

          // String sql = "insert into account values (3,'赵六',1500)";
          // String sql = "update account set balance = 20000 where id = 1";
          // String sql = "delete from account  where id = 1";
           String sql = "select * from account";
           stmt = conn.createStatement();
// 封装查询结果
            rs = stmt.executeQuery(sql);
           while(rs.next()){
               // 类似于迭代器
               // 让游标移动一下

               int id = rs.getInt(1);
               String name = rs.getString("name");
               int balance = rs.getInt(3);

               System.out.println(id + name + balance);
           }



       }catch(ClassCastException e) {
           e.printStackTrace();
       }catch (SQLException e){
           e.printStackTrace();
       }finally {
           // 释放资源
           if (stmt != null){
               try{
                   stmt.close();
               }catch (SQLException e){
                   e.printStackTrace();
               }
           }
           if (conn != null){
               try{
                   conn.close();
               }catch (SQLException e){
                   e.printStackTrace();
               }
           }

            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

       }
    }
}
