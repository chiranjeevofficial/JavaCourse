package Assignment_18;
class Person{
    private final String name;
    private final int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void getPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age:  "+age);
    }
}
public class Assignment18_01 {
    public static void main(String[] args) {
        Person p=new Person("Amit Kumar",21);
        p.getPerson();
    }
}
