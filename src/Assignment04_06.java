//6. Write a program to check whether a given number is positive, negative or zero.
public class Assignment04_06 {
    public static void main(String []args){
        int x=0;
        if(x>0)
            System.out.println("Positive Number");
        else if(x==0)
            System.out.println("Zero");
        else
            System.out.println("Negative Number");

//        by Ternary Operator
//        System.out.println(x<0?"Negative Number":x==0?"Zero":"Positive Number");
    }
}
