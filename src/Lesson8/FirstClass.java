package Lesson8;

public class FirstClass {

   public final static double Pi = 3.14;

    static int three (int a,int b,int c){
        int f = a * b * c;
        System.out.println(f);
        return  f;

    }

    static void vozvrat (int d,int j){

        System.out.println("Целое: " + d / j  + " " + "Остаток: " + d % j);
    }

    double ploshyadKruga (double r){
        FirstClass f = new FirstClass();
        double x = Pi * r * r;
        return x;
    }
    static  double dlinaOkruzhnosti (double r){  // static не дает использовать Pi
        FirstClass f = new FirstClass();
        double y = 2 * Pi * r;
        return y;
    }
    void  showInfo (double r){
        System.out.println("Радиус равен " + r );
        System.out.println("Площадь круга равна " + ploshyadKruga(r));
        System.out.println("Длина окружности равна " + dlinaOkruzhnosti(r));
    }



}

class FirstClassTest{
    public static void main(String[] args) {
        /*
        FirstClass.three(1,2,3);
        FirstClass.vozvrat(9,5);
        FirstClass.three(67,34,23);
        FirstClass.vozvrat(56,2);
         */
       FirstClass f = new FirstClass();
       f.showInfo(50.0);

    }
}