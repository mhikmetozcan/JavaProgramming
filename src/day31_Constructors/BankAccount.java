package day31_Constructors;

public class BankAccount {

    public String accountholder;
    public long accountNumber;
    public double balance;
    
    public void setInfo(String accountholder, int accountNumber) {
        this.accountholder = accountholder;
        this.accountNumber = accountNumber;
    }

    public void checkBalance(){
        System.out.println("Your available balance is: €" + balance);
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Depositing amount can not be zero or less");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
      if(amount > balance){
          System.out.println("Insufficient Balance");
          return;
      }else if (amount <= 0){
            System.out.println("Withdrawn amount can not be zero or less");
            return;
        }
        balance -= amount;
    }
    
    public String toString() {
        return "BankAccount{" +
                "accountholder='" + accountholder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= €" + balance +
                '}';
    }
}
