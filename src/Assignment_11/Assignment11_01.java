//1. Write a Java program to print current date.
package Assignment_11;
import java.time.LocalDateTime;
public class Assignment11_01 {
    public static void main(String[] args) {
        LocalDateTime t=LocalDateTime.now();
        System.out.println(t.toLocalDate());
    }
}
