package Lesson4;

public class Car {
    String color = "Red";
    String engine = "V6";

}

class CarTest{
    public static void main(String[] args) {

        Car Car1 = new Car();
        Car Car2 = new Car();
        Car1.color="Black";
        Car1.engine="V8";

        System.out.println("Color: "  + Car1.color);
        System.out.println("Engine: " + Car1.engine);
    }
}