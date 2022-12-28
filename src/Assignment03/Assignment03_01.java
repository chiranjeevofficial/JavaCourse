//1. Write a program with one char type variable. Assign ‘A’ in the variable.
//   Now change the value of variable from ‘A’ to ‘B’ using increment operator?
package Assignment03;
public class Assignment03_01 {
    public static void main(String []args){
        char ch='A';
        ch=++ch;
        System.out.println(ch); //B
    }
}
