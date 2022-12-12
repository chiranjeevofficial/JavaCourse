//1. Write a program to check whether a given number is divisible by 5 or not?
public class Assignment04_01 {
    public static void main(String []args){
        int x=20;

//        Through the if control statement
//        if(x%5==0)
//            System.out.println(x+" is divisible by 5");
//        else
//            System.out.println(x+" is not divisible by 5");

//        Through the ternary operator
        System.out.println(x%5==0?x+" is divisible by 5":x+" is not divisible by 5");
    }
}
