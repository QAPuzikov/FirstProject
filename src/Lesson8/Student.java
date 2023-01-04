package Lesson8;

public class Student {
    String name;
    int course;
   static int count;
    int a;

    public Student (String name2,int course2){
        count++;
        name=name2;
        course=course2;
        System.out.println("Студент номер " + count + " создан");


    }
    public static void showCount() {
        System.out.println("Всего создано студентов " + count);
    }
    public void showInfo (){
        System.out.println("Welcome to the Student class!!!");
    }
    void abc(){
       a++;
       count++;

    }
    static void abcd(){
        count++;
    }

    public static void main(String[] args) {
        abcd();
        Student st1 = new Student("Ivan",2);
        st1.abc();

    }


} //0:45:00



