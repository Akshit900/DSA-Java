package OOP;

import java.util.Arrays;

public class OOPMain1 {
    public static void main(String[] args) {
        //Store roll no.
        int [] number = new int[5];
        //Store Student name
        String [] names = new String[5];
        //data of student
        int [] rollno = new int[5];
        String [] name = new String[5];
        float [] marks = new float[5];
        Student [] students = new Student[5];
//        Student JohnDoe;
        Student JohnDoe = new Student();
        JohnDoe.rollno = 13;
        JohnDoe.name = "John Doe";
        JohnDoe.marks = 99.0f;

        System.out.println(JohnDoe.rollno);
        System.out.println(JohnDoe.name);
        System.out.println(JohnDoe.marks);
    }
    static class Student{
        int rollno;
        String name;
        float marks;
    }
}
