package Assignment_17;
class Person{
    String name;
    int age;
    public void setPerson(String name){
        this.name=name;
    }

    public void setPerson(int age){
        this.age=age;
    }

    public void setPerson(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void getPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age:  "+age);
    }
}
public class Assignment17_02 {
    public static void main(String[] args) {
        Person p=new Person();
        p.setPerson("Chiranjeev");
        p.setPerson(21);
        Person q=new Person();
        q.setPerson("Amit",20);
        p.getPerson();
        q.getPerson();
    }
}
