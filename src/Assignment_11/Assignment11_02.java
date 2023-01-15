package Assignment_11;
//2. Write a Java program to print current time.
import java.time.LocalTime;
public class Assignment11_02 {
    public static void main(String[] args) {
        LocalTime t=LocalTime.now();
        System.out.println(t);
    }
}
