package Lesson5;

 class Peremennaya {

     Peremennaya(String odin, String dwa) {

         one = odin;
         two = dwa;

         System.out.println("После цифры " + one + " идет цифра " + two);
     }
         String one;
         String two;
}

public class Peremennaya1{
     public static void main(String[] args) {
         Peremennaya P = new Peremennaya("Один","Два");
         Peremennaya P1 = new Peremennaya("Три", "Четыре");
         // sout можно не писать, т.к будет использоваться sout из верхненго объекта
     }
}
