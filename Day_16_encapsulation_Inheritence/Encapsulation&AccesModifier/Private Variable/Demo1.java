public class Demo1 {
    public static void main(String[] args) {
        // private variable cant be access outside the class directly

        Bank a = new Bank();

        // balance has private access modifier
        // System.out.println(a.balance);

        // we can access private variable by using method
        a.deposite(20);
        a.withdrawl(10);
        System.out.println(a.currentBalance());
        
        // this is a private method that why we cant access from outside the class
        //a.AccountPassword();

    }
}

class Bank {
    private double balance;

    double currentBalance() {
        return balance;
    }

    void deposite(double balance) {
        this.balance = balance;
    }

    void withdrawl(double amount) {
        this.balance = this.balance - amount;
    }

    private void AccountPassword() {

    }
}
