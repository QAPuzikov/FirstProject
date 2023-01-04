package Lesson13;

public class Month {


    public static void Month (int month){

        switch (month) {

            case 2:
                System.out.println("В этом месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            default:
                System.out.println("Нет такого месяца");

        }


    }

    public static void main(String[] args) {

     Month.Month(3);


    }
}
