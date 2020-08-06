package com.company.Day20.jdbc.empselectDemo;


import com.company.jdbc.empselectDemo.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBCEmp {
    public static void main(String[] args) {
        // 定义一个方法 查询emp表中所有的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入sql语句：");
        String s = scanner.nextLine();
        List<Emp> empList = new JDBCEmp().findAll(s);
        for(Emp empl:empList){
            System.out.println(empl);
        }
    }
    public List<Emp> findAll(String s){

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        String sql = s;
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9",
                    "root", "root");

            // String sql = "insert into account values (3,'赵六',1500)";
            // String sql = "update account set balance = 20000 where id = 1";
            // String sql = "delete from account  where id = 1";
            // String sql = "select * from emp";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);
             list = new ArrayList<>();
            while(rs.next()){
                // 类似于迭代器
                // 让游标移动一下

                int id = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                int salary = rs.getInt("sal");
                int bonus = rs.getInt("comm");
                int deptno = rs.getInt("deptno");

                Emp emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob(job);
                emp.setMgr(mgr);
                emp.setHiredate(hiredate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDeptno(deptno);
                list.add(emp);

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

        return list;
    }
}
