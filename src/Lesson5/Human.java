package Lesson5;

public class Human {

    String Name;
    Car3 car;
    BankAccount bA;

    void  info (){

        System.out.println("Имя " + Name + " цвет машины " + car.color+ " баланс банковского счета " + bA.balance);
    }
}

class  HumanTest{
    public static void main(String[] args) {
        Human H = new Human();
        H.Name = "Дэвид";
        H.car = new Car3("красный", "V8");
        H.bA = new BankAccount(18, 200.5);
        H.info();
    }
}
class Car3{
    Car3(String c,String e){

        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2){

        id = id2;
       balance = balance2;

    }
        int id;
        double balance;


}