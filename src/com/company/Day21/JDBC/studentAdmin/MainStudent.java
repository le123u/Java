package com.company.Day21.JDBC.studentAdmin;

import com.company.Day21.JDBC.studentAdmin.dao.Impl.StudentDaoImpl;
import com.company.Day21.JDBC.studentAdmin.domain.Student;

import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("---------欢迎登录low版学生管理系统--------");

        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("--------学生列表----------");
        List<Student> list = studentDao.findAll();
        for(Student s:list){
            System.out.println(s);
        }
        System.out.println("---------保存学生----------");
        Student student = new Student();
        studentDao.save(student);

        System.out.println("---------修改学生----------");
        Student student2 = new Student(1, "张三", "男", 40, "锦州", "1390000");
        studentDao.update(student2);


        System.out.println("---------删除学生----------");
        // studentDao.remove(1);
    }
}
