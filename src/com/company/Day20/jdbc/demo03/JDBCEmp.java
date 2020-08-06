package com.company.Day20.jdbc.demo03;

import com.company.jdbc.demo03.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCEmp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入sql语句：");
        String s = scanner.nextLine().toLowerCase();
        ArrayList<Emp> emps = new JDBCEmp().findAll(s);
        String[] split = s.split(" ");
        if(split[0].equals("select")){
            for(Emp emp:emps){
                System.out.println(emp);
            }
        }


    }

    public ArrayList<Emp> findAll(String s){
        Connection conn = null;
        Statement stet = null;
        ResultSet res = null;
        String sql = s;
        ArrayList<Emp> list = new ArrayList<>();
        String[] s1 = s.split(" ");
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9",
                    "root",
                    "root");
            stet = conn.createStatement();
            if(s1[0].equals("select")) {
                res = stet.executeQuery(sql);
                while (res.next()) {
                    list.add(new Emp(res.getInt("deptno"),
                            res.getString("dname"),
                            res.getString("loc")));
                }
                return list;
            }else if(s1[0].equals("update") || s1[0].equals("delete") || s1[0].equals("insert") || s1[0].equals("create")){
                int count = stet.executeUpdate(sql);
                if(count > 0){
                    System.out.println("操作成功");
                }else {
                    System.out.println("操作失败");
                }
            }


        }catch (ClassCastException e){
            e.printStackTrace();

        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            if (conn != null){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }if (stet != null){
                try{
                    stet.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }if (res != null){
                try{
                    res.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
