package Lesson4;

public class BankAccount {

    int id;
    String name = new String ("Petr");
    double balance;

    double popolnenieScheta (double bolshe){

        balance+=bolshe;
        return balance;

    }

    double snyatieScheta (double menshe){

        balance-=menshe;
        return balance;
    }

    void showInfo (){
        System.out.println("Имя клиента: " + name + " имеет на балансе " + balance);
    }
        
}





class BankAccountTest {

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Dmitry";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.0;

        HisAccount.id =3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        MyAccount.showInfo();
        MyAccount.popolnenieScheta(20.0);
        MyAccount.showInfo();
        MyAccount.snyatieScheta(43.9);
        MyAccount.showInfo();

    }
}