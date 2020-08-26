package com.company.chongchongchong;
// 题目：有五个学生，每个学生有3门课的成绩，
// 从键盘输入以上数据（包括学生号，姓名，三门课成绩），
// 计算出平均成绩，将原有的数据和计算出的平均分数存放在磁盘文件"stud"中。

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * /*分析
 * 7  * 1、自定义类student，包括学号，姓名，科目1成绩，科目2成绩，科目3成绩，平均成绩
 * 8  * public class 类名{
 * 9  *.数据类型  属性名称1；
 * 10  *.数据类型  属性名称2；
 * 11  * …
 * 12  * }
 * 13  * 2、分别调用三个学生的三科成绩，求出平均值后存入学生的信息中
 * 14  * 3、将信息表存入磁盘文件中
 * 15  *
 */
/*数据
 *  17  * 12 王力宏   66 77 88
 *  18  * 13 周杰伦   123 109 121
 *  19  * 14 薛之谦  89 72 123
 *  20  * */

public class Demo50 {
    public static void main(String[] args) {
        // 建立List容器，用来保存学习信息
        List<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);  //系统输入扫描器
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "个同学的学号、姓名、成绩1、成绩2、成绩3:(以空格相隔)");
            String[] s = sc.nextLine().split(" ");   //从键盘得到一个字符串，用空格分割为5个子字符串
            int ID = Integer.parseInt(s[0]);         //得到ID
            String name = s[1];               //姓名
            int grade1 = Integer.parseInt(s[2]);     //成绩1
            int grade2 = Integer.parseInt(s[3]);     //成绩2
            int grade3 = Integer.parseInt(s[4]);     //成绩3
            int aver = (grade1 + grade2 + grade3) / 3;  //用3个成绩计算出平均成绩
            Student stu = new Student(ID, name, grade1, grade2, grade3, aver);
            list.add(stu);   //将数据存入数据表中
        }
        sc.close();   //关闭扫描仪
        //输出数据表中的所有数据
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\n");
        }
        //创建一个字符缓冲输出流=====看不到懂啊
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("D:/stud.txt"));   //将数据存到"D:/stud.txt"
            for (int i = 0; i < list.size(); i++) {    //遍历数据表
                out.write(list.get(i) + "\n");         //将数据写入到
                out.newLine();          // 换行
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //自定义类Student
    public static class Student {
        int ID;  //学号
        String name;  //姓名
        private float grade1;  //成绩1
        private float grade2;  //成绩2
        private float grade3;  //成绩3
        private float aver;  //平均成绩

        public Student(int ID, String name, float grade1, float grade2, float grade3, float aver) {
            this.ID = ID;
            this.name = name;
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
            this.aver = aver;
        }

        public String toString() {
            return "学生学号:" + ID + " 姓名:" + name + " 成绩1:" + grade1 + " 成绩2:" + grade2 + " 成绩3:"
                    + grade3 + " 平均成绩:" + aver;
        }
    }
}
