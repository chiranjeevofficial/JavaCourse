package Assignment_15;
class Person{
    private String name;
    private int age;
    public Person(){
        System.out.println("This is Default Constructor");
    } //default constructor
    public Person(String Name){
        name=Name;
        System.out.println("This is only name argument Constructor");
    }
    public Person(int Age){
        age=Age;
        System.out.println("This is only age argument Constructor");
    }
    public Person(String Name, int Age){
        name=Name;
        age=Age;
        System.out.println("This is name and age arguments Constructor");
    }
}
public class  Assignment15_01{
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person("Chiranjeev");
        Person p3=new Person(21);
        Person p4=new Person("Chiranjeev",21);
    }
}
