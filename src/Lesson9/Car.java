package Lesson9;

public class Car {

    String color;
    int a = 10;
    String engine;
    static  int count;

    public static void changeA (int b){

    }

    public Car(String color, String engine){

        count++;
        this.color = color;
        this.engine = engine;

    }

  void abc (int a, int b){

  }
  void abcd (int a,int b){

  }
 void changeColor (String color){
     ;
 }

    public static void main(String[] args) {
        Car c = new Car("Red", "V6");
        System.out.println(c.color);
        c.changeColor("Black");
        System.out.println(c.color);
    }
}
