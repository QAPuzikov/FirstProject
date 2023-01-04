package Lesson12;

import Lesson11.Student;


public class StudentTest {


    public static void firstMethod(Student s1, Student s2) {

        if (s1.name.equals(s2.name) && s1.course==s2.course && s1.grade==s2.grade) {
            System.out.println("Студенты одинаковые");
        }
         else {
            System.out.println("Студенты не одинаковые");
        }
    }

    public static void secondMethod(Student s1,Student s2) {

        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Имена, оценки и курсы одинаковые");
                } else {
                    System.out.println("Имена и курсы одинаковые, оценки разные");
                }
            } else {
                System.out.println("Имена одинаковые, но курсы разные");
            }

        } else {
            System.out.println("Имена студентов отличаются");
        }


    }




    public static void main(String[] args) {

        Student s1 = new Student("Petr",5,4.7);
        Student s2 = new Student("Petr",5,4.7);
        StudentTest.firstMethod(s1,s2);
        StudentTest.secondMethod(s1,s2);
    }

}
