package Lesson5;

public class Employee {

    int id;
    int age;
    double salary;
    String Surname;
    String department;

    double Twice (Employee E){

        double two = E.salary * 2;
        System.out.println("Зарплата работника " + Surname + " равна " + salary + " если увеличить на 2, то получим " + two);
        return two;
    }

}

class  EmployeeTest{
    public static void main(String[] args) {

        Employee E1 = new Employee();
        Employee E2 = new Employee();

        E1.Surname = "Петров";
        E1.salary  = 20000.2;
        E1.Twice(E1);

        E2.Surname = "Иванов";
        E2.salary  =  40000.2;
        E2.Twice(E2);


    }
}
