//4. Write a program to calculate sum of the digits of a given number.
public class Assignment03_04 {
    public static void main(String []args){
        int x=123, sum;
        sum=x%10;   //sum=3
        x/=10;      //x=12
        sum+=x%10;  //sum=5
        x/=10;      //x=1
        sum+=x%10;  //sum=6
        x/=10;      //x=0
        System.out.println(sum); //sum=6
    }
}
