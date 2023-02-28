package Assignment_19;
class Account{
    double balance;
    String accountNumber;
    static double rateOfInterest;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }
}
public class Assignment19_01 {
    public static void main(String[] args) {
        Account a=new Account();
    }
}
