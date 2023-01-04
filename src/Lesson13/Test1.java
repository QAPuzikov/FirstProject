package Lesson13;

public class Test1 {



}

class Student{

    int grade;

    Student (int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {

        Student s1 = new Student(4);

        switch (s1.grade){

            case 2:
                System.out.println("Студент двоечник");
                break;
            case 3:
                System.out.println("Студент троечник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка не верна");

        }
    }
}
