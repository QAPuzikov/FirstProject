package Lesson10.p4;

import Lesson10.p1.A;
import Lesson10.p1.p2.B;
import Lesson10.p1.p2.p3.C;
import Lesson10.p4.p5.E;

import static Lesson10.p1.p2.B.b;
import static Lesson10.p1.p2.B.bb;

public class D {

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
        B b1 = new B();
        System.out.println(b1.b);
        System.out.println(b1.bb);
        C c1 = new C();
        System.out.println(c1.c);
        E e1 = new E();
        System.out.println(e1.e);

    }

}
