//5.	Write a program to print the first 10 odd natural numbers in reverse order.
public class Assignment05_05 {
    public static void main(String []args){
        for(int i=20;i>=1;i--){
            System.out.print(i%2!=0?i+" ":"");
        }
    }
}
