package Assignment_16;
class Person{
    private int age;
    private String name;
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
class Employee extends Person{
    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}
public class Assignment16_01 {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(21);
        p.setName("Chiranjeev");
        System.out.println("Person Name: "+p.getName());
        System.out.println("Person Age : "+p.getAge());
        Employee e=new Employee();
        e.setName("Anubhav");
        e.setAge(22);
        e.setSalary(21000);
        System.out.println("Employee Name  : "+e.getName());
        System.out.println("Employee Age   : "+e.getAge());
        System.out.println("Employee Salary: "+e.getSalary());
    }
}
