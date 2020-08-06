package com.company.Day20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo2 {
    public static void main(String[] args) throws Exception {

//        3、获取数据库连接对象 Connection
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java9",
                "root", "root");System.out.println(conn);
//        4、定义sql
        String sql = "insert into account values (3,'王五',1500)";
//        5、获取执行sql语句的对象 Statement
        Statement stmt = conn.createStatement();
//        6、执行sql，接受返回结果
        int count = stmt.executeUpdate(sql); // 返回受影响的行数
//        7、处理结果
       if (count > 0 ){
           System.out.println("添加成功");
       }else{
           System.out.println("添加失败");
       }
//        8、释放资源
        stmt.close();
        conn.close();
    }
}
