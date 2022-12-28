//4.	Define a class Employee with properties empid, name, salary and define setters and getters.
package Assignment_07;
class Employee{
    int empid;
    float salary;
    String name;
    void setters(int EmployeeID, float EmployeeSalary, String EmployeeName){
        empid=EmployeeID;
        salary=EmployeeSalary;
        name=EmployeeName;
    }
    void getters(){
        System.out.println("EmployeeName: "+name);
        System.out.println("EmployeeID: "+empid);
        System.out.println("Salary: "+salary);
    }
}
public class Assignment07_04 {
    public static void main(String []args){
        Employee e1=new Employee();
        e1.setters(1021,24500,"Amit Kumar");
        e1.getters();
    }
}
