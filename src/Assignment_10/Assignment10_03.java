// 3.	Write a Java program to print all the strings supplied through command line.
package Assignment_10;
public class Program03 {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)
            System.out.println("String-"+(i+1)+": "+args[i]);
    }
}
