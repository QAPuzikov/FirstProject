package Lesson11;

public class Employee {

    public String name;
    public double salary;

    Employee (String name, double salary){

        this.name=name;
        this.salary=salary;

    }

    public double увеличитель (double a){

        a = a * 2;
        return a;

    }

    public double зп2 (){

        salary = salary * 2;
        return  salary;
    }

}

class EmployeeTest{

    public static void main(String[] args) {

        Employee emp = new Employee("Ivan",100.55);
        double d = emp.увеличитель(emp.salary);
        System.out.println(d);
        System.out.println(emp.salary);
        emp.зп2();
        System.out.println(emp.salary);

    }
}