package Assignment_11;
//3. Write a Java program to print random number between 100 and 200.
import java.util.Random;
public class Assignment11_03 {
    public static void main(String[] args) {
        Random r=new Random();
        System.out.println("Random Number: "+r.nextInt(9999));
    }
}
