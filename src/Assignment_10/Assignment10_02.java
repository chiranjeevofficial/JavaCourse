// 2.	Write a Java program to add N numbers. Numbers are provided through command line.
package Assignment_10;
public class Program02 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<args.length;i++)
            sum=sum+Integer.parseInt(args[i]);
        System.out.println("Sum: "+sum);
    }
}
