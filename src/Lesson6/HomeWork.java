package Lesson6;

public class HomeWork {

    int sum (){
        int result = 0;
        System.out.println("Сумма чисел равна " + result);
        return result;
    }

    int sum (int a){
        int result = a;
        System.out.println("Сумма чисел равна " + result);
        return result;
    }

    int sum (int b,int c){
        int result = b + c;
        System.out.println("Сумма чисел равна " + result);
        return result;
    }

    int sum (int d,int e,int f){
        int result = d + e + f;
        System.out.println("Сумма чисел равна " + result);
        return result;
    }

    int sum (int g,int h,int i,int j){
        int result = g + h + i + j;
        System.out.println("Сумма чисел равна " + result);
        return result;
    }

}

class HomeWorkTest{
    public static void main(String[] args) {
        HomeWork h = new HomeWork();
        h.sum();
        h.sum(3);
        h.sum(3,5);
        h.sum(3,5,7);
        h.sum(3,5,7,11);
    }
}

