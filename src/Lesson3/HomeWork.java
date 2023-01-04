package Lesson3;

public class HomeWork {
    public static void main(String[] args) {

        int i1=5;
        int i2=11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result =0;
        result = i2/d1+d2%i1-l;

        System.out.println(result);

        int a = 5;
        int b = 8;

        int a1 = a-- - --a + ++a + a++ + a;
        int b1 = ++b - b++ + ++b - --b;

        System.out.println(a1); //15
        System.out.println(b1); //1

        /*
       5   -   3 +   4 + 4   + 5
       a-- - --a + ++a + a++ + a
         9 - 9   +  11 -  10
       ++b - b++ + ++b - --b
         */

    }
}
