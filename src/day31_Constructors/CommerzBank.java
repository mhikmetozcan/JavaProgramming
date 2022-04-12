package day31_Constructors;

public class CommerzBank {

    public static void main(String[] args) {

        BankAccount konto1 = new BankAccount();
        konto1.setInfo("Ahmet Özkök", 123456789);

        System.out.println(konto1);

        konto1.deposit(1000);
        konto1.checkBalance();
        konto1.withdraw(100);
        konto1.checkBalance();

        System.out.println("-------------------------------------");

        BankAccount konto2 = new BankAccount();
        konto2.setInfo("Aygün", 987654321);

        konto2.deposit(10000);
        konto2.checkBalance();

    }

}
