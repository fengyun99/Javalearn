package com.sortclassnotrewrite;

public class Student {

        private Integer age;
        private Integer score;
        private String name;

        public Student() {
        }

        public Student(Integer age, Integer score, String name) {
            this.age = age;
            this.score = score;
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", score=" + score +
                    ", name='" + name + '\'' +
                    '}';
        }
}
