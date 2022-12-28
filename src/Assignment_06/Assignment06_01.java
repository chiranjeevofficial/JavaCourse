//1.	Pattern 1 –
//      *
//      **
//      ***
//      ****
//      *****
package Assignment_06;
public class Assignment06_01 {
    public static void main(String []args){
        int i, j, k=2;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++)
                System.out.print(2<=i+j&&i+j<=k?"*":"");
            System.out.println();
            k+=2;
        }
    }
}
