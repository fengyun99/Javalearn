package com.sortclassnotrewrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareNoRewrite {
    public static void main(String[] args) {
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
        Collections.sort(studentList, (o1, o2) -> {
            //先按照年龄排序
            Integer i = o1.getAge().compareTo(o2.getAge());
            if (i == 0) {
                //如果年龄相等，则按照分数排序
                i = o1.getScore().compareTo(o2.getScore());
                if (i == 0) {
                    //如果分数相等，则按照姓名排序
                    i = o1.getName().compareTo(o2.getName());
                }
            }
            return i;
        });
        System.out.println("排序之后的list：");
        studentList.stream().forEach(System.out::println);

        //只按照年龄排序方式一：
        Collections.sort(studentList, (e1, e2) -> e1.getAge().compareTo(e2.getAge()));
        //只按照年龄排序方式二：
        Collections.sort(studentList, Comparator.comparingInt(Student::getAge));
        System.out.println("只按照年龄排序之后的list：");
        studentList.stream().forEach(System.out::println);
        //只按照姓名排序方式一：
        Collections.sort(studentList, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        //只按照姓名排序方式二：
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        //只按照姓名排序方式三：
        Collections.sort(studentList, Comparator.comparing(e -> e.getName()));
        //只按照姓名排序方式四：
        studentList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        //只按照姓名排序方式五：
        studentList.sort(Comparator.comparing(Student::getName));
        //只按照姓名排序方式六：
        studentList.sort(Comparator.comparing(e -> e.getName()));
        System.out.println("只按照姓名排序之后的list：");
        studentList.stream().forEach(System.out::println);
        //反着排序
        studentList.sort(Comparator.comparing(Student::getScore).reversed());
        System.out.println("只按照分数排序之后的list：");
        studentList.stream().forEach(System.out::println);
    }
}
