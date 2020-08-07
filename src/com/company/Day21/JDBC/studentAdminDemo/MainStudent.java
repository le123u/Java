package com.company.Day21.JDBC.studentAdminDemo;

import com.company.Day21.JDBC.studentAdminDemo.dao.Impl.StudentDaoImpl;
import com.company.Day21.JDBC.studentAdminDemo.domain.Student;

import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("----------欢迎登陆low版学生系统---------");

        StudentDaoImpl dao = new StudentDaoImpl();

        System.out.println("--------学生列表-----------");
        List<Student> li = dao.findAll();
        for (Student list:li){
            System.out.println(list);
        }

        System.out.println("---------增加学生----------");
        Student student = new Student();
        dao.save(student);

        System.out.println("--------------删除学生----------");
        dao.remove(9);

        System.out.println("--------------修改学生信息----------");
        Student student1 = new Student();
        dao.update(student1);
    }
}
