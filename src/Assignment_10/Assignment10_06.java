// 6. Write a Java program to filter and print numbers which are Prime. Num-bers are provided through command line.
package Assignment_10;
public class Assignment10_06{
    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            int num=Integer.parseInt(args[i]), j;
            for(j=2;j<num;j++)
                if(num%j==0)
                    break;
            System.out.println(num==j?num+" is a Prime Number":num+" is not a Prime Number");
        }
    }
}