package Lesson6;

public class MethodOverloading {
    void show (int i1){
        System.out.println(i1);
        System.out.println("Data Type is Int");
    }

    void show (int a,int b){
        System.out.println(a);
        System.out.println("Data Type is Int");
    }
    void show (boolean b1){
        System.out.println(b1);
        System.out.println("Data Type is Boolean");
    }
    void show (String s1){
        System.out.println(s1);
        System.out.println("Data Type is String");
    }
    void show (String s,int a){
        System.out.println("String: " + s + " "+"Int: " + a);
    }
    void show (int a, String s){
        System.out.println("Какой хороший день");
    }


}


class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading MO = new MethodOverloading();
        int  a=500;
        MO.show(a);
        boolean b = true;
        MO.show(b);
        String s = "Privet";
        MO.show(s);
        MO.show("Privet",10);
        MO.show(10,"Privet");
    }
}

