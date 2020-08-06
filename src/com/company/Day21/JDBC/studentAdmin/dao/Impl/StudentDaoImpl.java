package com.company.Day21.JDBC.studentAdmin.dao.Impl;


import com.company.Day21.JDBC.studentAdmin.dao.StudentDao;
import com.company.Day21.JDBC.studentAdmin.domain.Student;
import com.company.Day21.JDBC.studentAdmin.utils.JDBCUtils;


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
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from studentManage";
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int score = rs.getInt("score");
                String addr = rs.getString("addr");
                String  tel = rs.getString("tel");
                list.add(new Student(id, name, gender, score, addr, tel));
            }
            }catch(SQLException e){
                e.printStackTrace();
            }

            return list;
        }


    @Override
    public void save(Student student) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into studentManage values (6,'王五','男',35,'葫芦岛','182000');";
            stmt = conn.createStatement();
            int count = stmt.executeUpdate(sql);
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn);
        }


    }

    @Override
    public void remove(Integer id) {

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = com.company.Day21.JDBC.demo.JDBCUtils.getConnection();
            String sql = "delete from studentManage  where id = 2";
            stmt = conn.createStatement();

            int count = stmt.executeUpdate(sql);

            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn);

        }

    }

    @Override
    public void update(Student student) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = com.company.Day21.JDBC.demo.JDBCUtils.getConnection();
            String sql = "update studentManage set score = score + ? where id = ?";
             pstmt = conn.prepareStatement(sql);

             pstmt.setInt(1,30);
             pstmt.setInt(2,1);

            int count = pstmt.executeUpdate();

            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);

        }
    }
}
