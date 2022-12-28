//3.  Write a program to make the last digit of a number stored in a variable as zero.
//        (Example – if x=2345 then make it x=2340)
package Assignment_03;
public class Assignment03_03 {
    public static void main(String []args){
        int x=2345;
        x=x/10*10;
        System.out.println(x); //2340
    }
}
