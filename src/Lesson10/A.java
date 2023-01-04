package Lesson10;

import Lesson9.*; // импорт всего пакета, для импорта нужен public.
//import Lesson8.*; // Если у двух пакетов есть одинаковые названия классов, надо указывать перед классом название пакета Lesson8.Car
import Lesson9.a.*;
import static Lesson9.a.NoError.*;

public class A {

    public static void main(String[] args) {

        Car c1 = new Car("black","v8");
        Car c2 = new Car ("red", "v6");
        Student s1 = new Student();
        System.out.println(s1.z);
        System.out.println(Student.c); // c стастичная переменная класса Lesson9, для ее отображения надо использовать название класса т.е Student
        NoError n = new NoError(" ");
        System.out.println(n.c);

    }

}
class B {
    Student s2 = new Student();
}


