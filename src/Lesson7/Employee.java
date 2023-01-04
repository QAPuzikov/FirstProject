package Lesson7;

public class Employee {


    private double salary;
    public String surname;
    int id;


    public double zarplata (double salary){
        System.out.println(salary);
        return salary;
    }

    public String familia (String surname){
        System.out.println(surname);
        return surname;
    }

    public int nomer (int id){
        System.out.println(id);
        return id;
    }

    private Employee(int id2){
        this(id2,null,0.0);
    }

    Employee(int id3,String surname3){
        this(id3,surname3,0.0);
    }
    public Employee (int id4,String surname4, double salary4) {
        id = id4;
        surname = surname4;
        salary = salary4;

    }

}

class Test{
    public static void main(String[] args) {
       Employee emp = new Employee (2,"Fofa",8.0);
        System.out.println(emp.surname);
       emp.nomer(65);

    }
}



