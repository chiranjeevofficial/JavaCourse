package Assignment_15;
class Customer{
    private final int id;
    private final String name, email, mobile;
    public Customer(int CustomerID, String CustomerName, String CustomerMobile, String CustomerEMail){
        id=CustomerID; mobile=CustomerMobile; name=CustomerName; email=CustomerEMail;
    }
    public Customer(int CustomerID, String CustomerName, String CustomerMobile){
        id=CustomerID; mobile=CustomerMobile; name=CustomerName; email="no email found";
    }
    public String toString(){
        return "Customer ID:     "+id+
               "\nCustomer Name:   "+name+
               "\nCustomer Mobile: "+mobile+
               "\nCustomer Email:  "+email+"\n";
    }
}
public class Assignment15_05 {
    public static void main(String[] args) {
        Customer c1=new Customer(11, "Chiranjeev", "7983499004", "samplemail@gmail.com");
        Customer c2=new Customer(12, "Rambharose", "7983499022");
        System.out.println(c1);
        System.out.println(c2);
    }
}
