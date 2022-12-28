//1. Define a class Account to represent a bank account. Create accountNumber,
//   customerName, balance as instance member and rateOfInterest as
//   static variable. Provide member functions for the following operations.
//        a. Set account number
//        b. Set customer name
//        c. Set balance
//        d. Set rate of interest
//        e. Calculate simple interest (take time as an argument)
//        f. Get account number
//        g. Get balance
//        h. Get customer name
class Account{
    int accountNumber;
    String customerName;
    float balance;
    static float rateOfInt;
    void setAccountNumber(int AccountNumber){
        accountNumber=AccountNumber;
    }
    void setCustomerName(String CustomerName){
        customerName=CustomerName;
    }
    void setBalance(float Balance){
        balance=Balance;
    }
    static void setRateOfInt(float rateOfInterest){
        rateOfInt=rateOfInterest;
    }
    int getAccountNumber(){
        return accountNumber;
    }
    float getBalance(){
        return balance;
    }
    String getCustomerName(){
        return customerName;
    }
}
public class Assignment08_01 {
    public static void main(String []args){
        Account A=new Account();
        A.setAccountNumber(331000123);
        A.setBalance(23500);
        A.setCustomerName("Girjadhisha");
        System.out.println(A.getCustomerName()+": "+"Account Details");
        System.out.println("Account Number  : "+A.getAccountNumber());
        System.out.println("Account Balance : "+A.getBalance());
        Account.setRateOfInt(2.45f);
        System.out.println("rate of Interest: "+Account.rateOfInt);
    }
}
