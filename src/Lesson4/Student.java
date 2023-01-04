package Lesson4;

import Lesson6.Employee;

public class Student {

    int numberStudentTicket;
    String name;
    String Surname;

    int course;
    int yearEducation;

    double EstimateEnglish;
    double EstimateMath;
    double EstimateEconomic;

    Student (){
        System.out.println("Empty");
    }
    Student(int numberStudentTicket2,String name2,String Surname2,int course){
        this (numberStudentTicket2,name2,Surname2,course,0);
    }
    Student (int numberStudentTicket1,String name1,String Surname1, int course1,int yearEducation1){

        numberStudentTicket=numberStudentTicket1;
        name=name1;
        Surname=Surname1;
        course=course1;
        yearEducation=yearEducation1;

    }
}

class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student(1,"Vanya","Petrov",3,3);
        System.out.println(st1.name);
        Student st2 = new Student(2,"Kolya","Pipka",3);
        System.out.println(st2.Surname);
        Student st3 = new Student();
        System.out.println(st3);










    }
}