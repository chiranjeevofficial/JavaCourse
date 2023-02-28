package Assignment_18;
class GenPerson{
    String name;
    int age;
    GenPerson(){
        this("Name not found",0);
        //Sample Code
    }
    GenPerson(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends GenPerson{
    private double salary;
    public Employee(){
        this(0.0);
        //Sample Code
    }
    public Employee(double salary){
        this.salary=salary;
    }
    public void getEmployee(){
        System.out.println("Name  : "+name);
        System.out.println("Age   : "+age);
        System.out.println("Salary: "+salary);
    }
}
public class Assignment18_03 {
    public static void main(String[] args) {
        Employee e=new Employee(12000.50);
        e.getEmployee();
    }
}
