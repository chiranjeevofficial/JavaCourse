package Assignment_15;
import java.util.Scanner;
class Employee{
    private int empID;
    private final double salary;
    private final String name;
    private static int tempID=0;
    void setID(){
        empID=++tempID;
    }
    Employee(){
        setID();
        System.out.print("Enter Employee Name: ");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        while(!sc.hasNextDouble())
            sc.next();
        salary=sc.nextDouble();
    }
    Employee(String EmployeeName, double EmployeeSalary){
        setID();
        name=EmployeeName;
        salary=EmployeeSalary;
    }
    Employee(String EmployeeName, int EmployeeSalary){
        setID();
        name=EmployeeName;
        salary=(float)EmployeeSalary;
    }
    public String toString() {
        return "Employee ID:     "+empID+"\nEmployee Name:   "+name+"\nEmployee Salary: "+salary+"\n";
    }
}
public class Assignment15_02 {
    public static void main(String[] args) {
        Employee e1=new Employee("Chiranjeev Kashyap",25000);
        Employee e2=new Employee("Amit Kumar",13500.70);
        Employee e3=new Employee();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
