/*
Method overloading

Перезагруженные методы имеют одинаковые имена и разный список параметров


                   Разный по типам данных:

void method (int a, String b) {}
void method (double a,boolean b) {}

                   Разный по колличеству:

void method (int a, int b) {}
void method (int a, int b,int c) {}

                    Разный по порядку:

void method (int a, String b) {}
void method (String a, int b) {}

                    Rules of Overloading

Return type может быть одинаковый  и различный:
void method (int a, String b) {}
void method (double a,boolean b) {}
int method (long a)                  {return 5;}

              Access modifier может быть одинаковый и различный:

public void method (int a, int b) {}
private void method (int a, int b,int c) {}
public int method (long a)           {return 5;}

             Методы отличабщиеся только return type или access modifier
                   не являются overloaded (Compile ERROR):

public void method (int a, String b) {}     {   }
private void method (int a, String b) {}    {   }
public String method (int a, String b) {}   {return "a";}

                                     this

Конструктор не может вызвать внутри себя overloaded конструктор по имени класса (Compile Error):




 */