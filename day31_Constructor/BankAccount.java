package day31_Constructor;

public class BankAccount {
        public String  accountHolder;
        public long accountNumber;
        public double balance;

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$" + balance +
                '}';
    }

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;






    }

    public void checkBalance(){
        System.out.println("Your available balance is: "+balance);
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;//exits the method if the amount is invalid
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;//exits
        }
        if(amount<=0){//if withdrowing amount is negative or zero
            System.out.println("Withdrowing amount camn not be negative or zero");
            return;
        }
        balance-=amount;
    }





}
/*BankAccount Task:
        Attributes:
                1. accountHolder, 2. accountNumber,
3. balance
        Actions:
        1. setInfo(): sets the accountHolder and
accountNumber attributes
        2. toString()
            3. checkBalance():displays the available
balance
            2. deposit(): increases the balance by the
given amount
3. withdraw(): decreases the balance by
the given amount

 */