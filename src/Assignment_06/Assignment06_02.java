//2.	Pattern 2 –
//          *
//         **
//        ***
//       ****
//      *****
package Assignment_06;
public class Assignment06_02 {
    public static void main(String []args){
        int i, j, k=6;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++)
                System.out.print(6<=i+j&&i+j<=k?"*":" ");
            System.out.println();
            k++;
        }
    }
}
