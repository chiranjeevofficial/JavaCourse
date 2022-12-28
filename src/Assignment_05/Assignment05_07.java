//7.	Write a program to print the first 10 even natural numbers in reverse order.
package Assignment_05;
public class Assignment05_07 {
    public static void main(String []args){
        for(int i=20;i>=1;i--){
            System.out.print(i%2==0?i+" ":"");
        }
    }
}
