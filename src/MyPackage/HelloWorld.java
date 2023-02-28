package MyPackage;
class Person {
    protected int age;
    protected String name;
    public Person(){
        //Sample Code
    }
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void getPerson() {
        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
    }
}

class Employee extends Person {
    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public Employee(String name, int age, double salary) {
        super(name,age);
        this.salary=salary;
    }
    public Employee(){
        super();
    }
    public void getEmployee() {
        super.getPerson();
        System.out.println("Salary: "+this.salary);
    }
    public void printName(){
        System.out.println("Employee Name: "+this.getName());
    }
}

class A implements Runnable{
    public void run(){
        f1();
    }
    public void f1(){
        for(int i = 0 ; i < 10 ; i++)
            System.out.println("i="+i);
    }
}

class B implements Runnable{
    public void run(){
        f2();
    }
    public void f2(){
        for(int j = 0 ; j < 10 ; j++)
            System.out.println("j="+j);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
