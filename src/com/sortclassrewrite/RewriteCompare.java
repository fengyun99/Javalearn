package com.sortclassrewrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RewriteCompare {
    public static void main(String[] args) {
        //        List<Integer> list3 = new ArrayList<>(Arrays.asList(3,7,1,9,2,10,7,23));
//        //排序算法排序
//        Integer temp;
//        for (int i = 0; i < list3.size(); i++){
//            for (int j = i+1; j < list3.size(); j++){
//                if (list3.get(i) > list3.get(j)){
//                    temp = list3.get(j);
//                    list3.set(j,list3.get(i));
//                    list3.set(i,temp);
//                }
//            }
//        }
//        System.out.println(list3);
//        List<Integer> list4 = new ArrayList<>(Arrays.asList(3,7,1,9,2,10,7,23));
//        List<String> list5 = new ArrayList<>(Arrays.asList("c","a","b"));
//        List<String> list6 = new ArrayList<>();
//        list6.add("啊");
//        list6.add("从");
//        list6.add("吧");
//        list6.add("在");
//        list6.add("爱");
//        //超类
//        Collections.sort(list4);
//        //数字
//        System.out.println(list4);
//        //字母
//        Collections.sort(list5);
//        System.out.println(list5);
//        //汉字
//        Collections.sort(list6);
//        System.out.println(list6);

//        //数字
//        list4.sort(Comparator.comparingInt(a -> a));
//        System.out.println(list4);
//
//        list4.sort(Comparator.comparingInt(a -> -a));
//        System.out.println(list4);
//
//        list5.sort(Comparator.comparing(a -> a));
//        System.out.println(list5);
//        //对象操作
//        List<User> list_u = new ArrayList<>();
//        User user1 = new User(1,"奥");
//        User user2 = new User(2,"涛");
//        User user3 = new User(3,"笔");
//        User user4 = new User(4,"异");
//        list_u.add(user1);
//        list_u.add(user2);
//        list_u.add(user3);
//        list_u.add(user4);
        //针对简单包装类型进行排序
        List<String> stringList = new ArrayList<>();
        stringList.add("张三");
        stringList.add("李四");
        stringList.add("王五");
        stringList.add("赵六");
        System.out.println("排序之前的顺序：" + stringList );
        Collections.sort(stringList);
        System.out.println("排序之后的顺序：" + stringList );
        /**
         * 注意这个reserve方法，是反转，而不是在无序的前提下直接倒序
         */
        Collections.reverse(stringList);
        System.out.println("反转之后的顺序：" + stringList );

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(1);
        integerList.add(9);
        integerList.add(5);
        integerList.add(12);
        integerList.add(20);
        System.out.println("排序之前的顺序" + integerList);
        Collections.sort(integerList);
        System.out.println("排序之后的顺序" + integerList);
        /**
         * 注意这个reserve方法，是反转，而不是在无序的前提下直接倒序
         */
        Collections.reverse(integerList);
        System.out.println("反转之后的顺序：" + integerList );

        //对象
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(23, 90, "张三"));
        studentList.add(new Student(22, 97, "李四"));
        studentList.add(new Student(23, 95, "王五"));
        studentList.add(new Student(24, 91, "赵六"));
        studentList.add(new Student(21, 98, "赵六"));
        studentList.add(new Student(21, 98, "赵五"));
        studentList.add(new Student(21, 98, "赵七"));
        System.out.println("排序之前的list：");
        studentList.stream().forEach(System.out::println);
        //Collections.sort(studentList);
        //System.out.println("排序之后的list：");
        //studentList.stream().forEach(System.out::println);
        //使用lambda表达式的sort是一样的效果
        System.out.println("使用lambda表达式排序之后的list：");
        studentList.sort(Comparator.comparing(a -> a));
        studentList.stream().forEach(System.out::println);
    }
}
