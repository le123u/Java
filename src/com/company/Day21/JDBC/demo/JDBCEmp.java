package com.company.Day21.JDBC.demo;

import com.company.Day20.jdbc.JDBCJDBC.domain.Emp;
import com.company.Day21.JDBC.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCEmp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入sql语句:");
        String s = scanner.nextLine().toLowerCase();
        ;
        String[] split = s.split(" ");
        ArrayList<Emp> emps = new JDBCEmp().findaAllUseJDBCUtils(s);
        if (split[0].equals("select")) {
            for (Emp emp : emps) {
                System.out.println(emp);
            }
        }
    }

    /**
     * 演示JDBCUtils
     */
    public ArrayList<Emp> findaAllUseJDBCUtils(String s) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = new ArrayList<>();
        String sql = s;
        String[] s1 = s.split(" ");
        try {
            conn = JDBCUtils.getConnection();

            stmt = conn.createStatement();

            if (s1[0].equals("select")) {
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    int empno = rs.getInt("EMPNO");
                    String ename = rs.getString("ENAME");
                    String job = rs.getString("JOB");
                    int mgr = rs.getInt("MGR");
                    Date hiredate = rs.getDate("HIREDATE");
                    int sal = rs.getInt("SAL");
                    int comm = rs.getInt("COMM");
                    int deptno = rs.getInt("DEPTNO");
                    list.add(new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno));
                }
                return list;
            } else if (s1[0].equals("update") || s1[0].equals("delete") || s1[0].equals("insert") || s1[0].equals("create")) {
                int count = stmt.executeUpdate(sql);
                if (count > 0) {
                    System.out.println("操作成功");
                } else {
                    System.out.println("操作失败");
                }
            }
            }catch(SQLException e){
                e.printStackTrace();
            }


            return list;
        }
    }

