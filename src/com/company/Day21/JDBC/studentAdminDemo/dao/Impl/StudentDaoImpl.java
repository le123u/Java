package com.company.Day21.JDBC.studentAdminDemo.dao.Impl;

import com.company.Day21.JDBC.studentAdminDemo.dao.StudentDao;
import com.company.Day21.JDBC.studentAdminDemo.domain.Student;
import com.company.Day21.JDBC.studentAdminDemo.utils.JDBCUtils;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Student> list = new ArrayList<>();
        try{
            conn = JDBCUtils.getConnection();
            String sql = "select * from studentManage;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int scores = rs.getInt("score");
                String addr = rs.getString("addr");
                String tel = rs.getString("tel");

                list.add(new Student(id,name,gender,scores,addr,tel));

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void save(Student student) {
        Connection conn = null;
        Statement stmt = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "insert into studentmanage values(9,'liu','男',88,'大连','151000');";
             stmt = conn.createStatement();
            int count = stmt.executeUpdate(sql);
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
           JDBCUtils.close(stmt,conn);
        }

    }

    @Override
    public void remove(Integer id) {
        Connection conn = null;
        Statement stmt = null;

        try{
            conn = JDBCUtils.getConnection();
            String sql = "delete from studentmanage where id = 9;";
            stmt = conn.createStatement();
            int count = stmt.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn);
        }

    }

    @Override
    public void update(Student student) {
        Connection conn = null;
        PreparedStatement pestmt = null;
        try{
           conn = JDBCUtils.getConnection();
            String sql = "update studentmanage set score = score + ? where id = ?;";
            pestmt = conn.prepareStatement(sql);
            pestmt.setInt(1,20);
            pestmt.setInt(2,4);
            int count = pestmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pestmt,conn);
        }

    }
}
