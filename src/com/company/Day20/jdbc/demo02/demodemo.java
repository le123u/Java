package com.company.Day20.jdbc.demo02;

import com.company.jdbc.demo02.domain.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class demodemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入SQL语句：");
        String s = scanner.nextLine();
        ArrayList<demo> list = new demodemo().findAll(s);
        for(demo de:list){
            System.out.println(de);
        }

    }

    public ArrayList<demo> findAll(String s){
        ArrayList<demo> list = null;
        Connection conn = null;
        Statement stem = null;
        ResultSet res = null;
        String sql = s;
        try{
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java9",
             "root",
             "root");

            stem = conn.createStatement();

             res = stem.executeQuery(sql);
            list = new ArrayList<>();
            while(res.next()){
                int deptno = res.getInt("deptno");
                String name = res.getString("dname");
                String loc = res.getString("loc");

                demo demo = new demo();

                demo.setDeptno(deptno);
                demo.setDname(name);
                demo.setLoc(loc);

                list.add(demo);
            }

        }catch(ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (stem != null){
                try{
                    stem.close();
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

            if (res != null){
                try{
                    res.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }


        }




        return list;
    }
}
