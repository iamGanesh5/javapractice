package com.student.domain;

public class Demo {
    public static void main(String[] args) {

        Student std=new Student();
        System.out.println(std.getSid());
        std.setSid1(90,"Ganesh"); // in this case data set to the obj with the help of seter mehod.
        System.out.println(std.getSid());    // in this case date get the date from obj with the helip of getter method.
        System.out.println(std.returnName());






    }
}
