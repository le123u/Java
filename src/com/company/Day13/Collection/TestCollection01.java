package com.company.Day13.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection01 {
    public static void main(String[] args) {
        // 使用多态形式创建集合对象
        Collection<Object> coll = new ArrayList<>();
        // add
        coll.add("小鲁班");
        coll.add("安其拉");
        coll.add("后羿");

        System.out.println(coll);

        // public boolean contains(E e) 判断当前集合中是否包含元素e
        System.out.println(coll.contains("后羿"));
        System.out.println(coll.contains("刘东东"));

        //  public boolean remove(E e)把给定对象元素e从集合中删除
        System.out.println(coll.remove("小鲁班"));
        System.out.println("删除之后"+coll);

        // public boolean isEmpty() 判断当前集合是否为空
        System.out.println(coll.isEmpty());

        //public int size() 返回集合中元素的个数
        System.out.println(coll.size());

        // public Object[] toArray() 把集合中的元素返回为Object[]数组
        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        // public void clear()   清空集合中所有的元素
        coll.clear();
        System.out.println(coll);
    }
}
