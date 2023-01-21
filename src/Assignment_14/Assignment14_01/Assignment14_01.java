//1.	Define a Java class Person with private instance variables name and age.
//      Demonstrate how you can access instance variables of Person from
//      Main class’s main method.
//      Answer
//      We access the private instance variable through the public member.
package Assignment_14.Assignment14_01;
public class Assignment14_01 {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(21);
        p.setName("Chiranjeev Kashyap");
        System.out.println("Person name: "+p.getName());
        System.out.println("Person age : "+p.getAge());
    }
}
