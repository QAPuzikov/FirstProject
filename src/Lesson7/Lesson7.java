/*
Package место где хранятся классы.
Аналог папки.

Цели:

1. Защита доступа;
2. Управление набором возможных имен;
3. Хранение связанных классов в одном месте;

Контроллер доступа (Access modifier)

1. public    видят все packages  и classes;
2. private   виден только внутри самого класса {};
3. (default) ставится когда не обозначен Access modifier, виден только внутри пакета;
4. protected виден в рамках одного пакета + виден классам наследникам;


____________________________________________________________
            | public  |  private  |  (default) |  protected |
____________|_________|___________|____________|____________|
class       |    +    |    -      |     +      |     -      |
____________|_________|___________|____________|____________|
constructor |    +    |    +      |     +      |     +      |
____________|_________|___________|____________|____________|
variable    |    +    |    +      |     +      |     +      |
____________|_________|___________|____________|____________|
method      |    +    |    +      |     +      |     +      |
____________|_________|___________|____________|____________|


 */