// 9.	Write a Java program to find the greatest number among all the numbers provided through command line.
package Assignment_10;
public class Program09 {
    public static void main(String[] args) {
        int i, great=0;
        for(i=0;i<args.length;i++){
            if(great<Integer.parseInt(args[i]))
                great=Integer.parseInt(args[i]);
        }
        System.out.println("Greatest Number is: "+great);
    }
}
