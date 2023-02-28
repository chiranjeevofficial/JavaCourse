package Assignment_16;
class Account{
    private long accountNumber;
    private double balance;

    protected void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    protected long getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
class Customer extends Account{
    private String customerName;
}
public class Assignment16_02 {
}
