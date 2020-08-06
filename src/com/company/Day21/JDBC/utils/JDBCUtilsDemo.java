package com.company.Day21.JDBC.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtilsDemo {
    // 定义成员变量 可以切换不同的连接池
    private static DataSource ds;

    // 初始化配置
    static {
        try{
            // 加载配置文件
            Properties pro = new Properties();
            pro.load
                    (JDBCUtilsDemo.class.getClassLoader().getResourceAsStream("druid.properties"));
            // 获取定义成员变量
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取链接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    // 释放资源
//    public static void close(ResultSet rs, Statement stmt,Connection conn){
//        close(null,stmt,conn);
//    }
    public static void close(ResultSet rs,Statement stmt,Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            }
        catch(SQLException e){
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

    // 获取连接池的方法
    public static DataSource getDataSource(){
        return ds;
    }
}
