package Lesson6;

public class MethodOverloading2 {

    public int sum (int i1, int i2){
        return i1+i2;
    }
    protected String sum (String s1,String s2){
        return s1+s2;
    }

}

class  MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 MO2 = new MethodOverloading2();
       int a = MO2.sum(5,7);
        System.out.println(a);
        String s = MO2.sum ("Privet"," moi drug");
        System.out.println(s);

    }

}