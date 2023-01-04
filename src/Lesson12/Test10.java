package Lesson12;

public class Test10 {

    public static void main(String[] args) {

        int salary = 700;
        boolean b = true;

        if (salary < 200) {

            System.out.println("ЗП низкая");
        } else if (salary < 400 && b == false || true) {
            System.out.println("ЗП средняя");
        } else if (b == true) {
            System.out.println("ЗП высокая");
        }
        else {
            System.out.println("ЗП отличная");
        }
    }
}
