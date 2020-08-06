package com.company.Day20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo3 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement stmt = null;
       try{
            conn = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/java9",
                   "root", "root");System.out.println(conn);

           String sql = "insert into account values (4,'赵六',1500)";

           stmt = conn.createStatement();

           int count = stmt.executeUpdate(sql);

           if (count > 0 ){
               System.out.println("添加成功");
           }else{
               System.out.println("添加失败");
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


       }
    }
}
