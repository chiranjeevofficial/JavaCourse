//9. Write a program to reverse a three-digit number.
public class Assignment03_09 {
    public static void main(String []args){
        int x=123, rev=0;
        rev=(rev+(x%10))*10;
        x/=10;
        rev=(rev+(x%10))*10;
        x/=10;
        rev=rev+(x%10);
        System.out.println(rev);
    }
}
