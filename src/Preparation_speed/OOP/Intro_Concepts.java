package Preparation_speed.OOP;

import java.util.Arrays;

public class Intro_Concepts {
    static class Student{
        int rno;
        String name;
        float marks;

        Student(){
            this.rno=13;
            this.name="Akshit Koundal";
            this.marks=88.5f;
        }
        Student (Student other){
            this.name = other.name;
        }
        //We can use this constructor and pass the value and create as may people you like too.
        //Student John = new Student(21, "John Doe", 90.5f);
        //this will replace with john (because this is pointing or referring to john)
        Student(int roll, String name, float marks){
            this.rno = roll;
            this.name = name;
            this.marks = marks;
        }
    }
    public static void main(String[] args) {
        Student [] students = new Student[5];
        Student Akshit = new Student(15, "John Doe", 88.7f);
        Student random = new Student(Akshit);
        System.out.println(random.name);
//        Akshit.rno = 1601;
//        Akshit.name = "Akshit Koundal";
//        Akshit.marks = 88.5f;
        System.out.println(Akshit.rno);
        System.out.println(Akshit.name);
        System.out.println(Akshit.marks);

    }
}
