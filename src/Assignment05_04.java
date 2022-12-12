//4.	Write a program to print the first 10 odd natural numbers.
public class Assignment05_04 {
    public static void main(String []args){
        for(int i=1;i<=20;i++){
            System.out.print(i%2!=0?i+" ":"");
        }
    }
}
