package Lesson11;

public class Car {

    public String color;
    public String engine;
    public int doors;

    public Car ( String color,String engine, int doors){

        this.engine = engine;
        this.color  = color;
        this.doors  = doors;
    }

}

class CarTest{

    public static void doors2 (Car c1, int count){

        c1.doors = count;
    }

    public static void color2 (Car c1,Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;

    }

    public static void main(String[] args) {
        Car c1 = new Car("Blue", "V6", 4);
        Car c2 = new Car("Green","V8",5);
        doors2(c1,6);
        System.out.println(c1.doors);
        color2(c1,c2);
        System.out.println(c1.color);
        System.out.println(c2.color);

    }
}