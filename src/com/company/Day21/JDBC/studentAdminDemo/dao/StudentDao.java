package com.company.Day21.JDBC.studentAdminDemo.dao;

import com.company.Day21.JDBC.studentAdminDemo.domain.Student;

import java.util.List;

public interface StudentDao {
    // 查询所有学生
    public List<Student> findAll();
    // 保存某个学生
    public void save(Student student);
    // 删除某个学生
    public void remove(Integer id);
    // 修改某个学生
    public void update(Student student);
}
