//5. Define a class Contact with fields id, firstName, lastName, mobileNo and emailId. Provide setters and getters.
package Assignment_07;
class Contact{
    int id;
    String firstName, lastName, emailId;
    long mobileNo;
    void setters(int ID, String FirstName, String LastName, long MobileNo, String EmailID){
        id=ID;
        firstName=FirstName;
        lastName=LastName;
        mobileNo=MobileNo;
        emailId=EmailID;
    }
    void getters(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Mobile No: "+mobileNo);
        System.out.println("EmailID: "+emailId);
    }
}
public class Assignment07_05 {
    public static void main(String []args){
        Contact c1=new Contact();
        c1.setters(1201,"Chiranjeev","Kashyap",7983499388l,"iamchiranjeev@gmail.com");
        c1.getters();
    }
}
