package Lesson9;

import java.lang.management.GarbageCollectorMXBean;

public class Student {

    int a = 10;
    public static  int c =5;
    public int z = this.c;
    static  int f = c;
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        st1 = null;


    }
}
