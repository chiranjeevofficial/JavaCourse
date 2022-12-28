//4.	Pattern 4 –
//      *****
//       ****
//        ***
//         **
//          *
package Assignment_06;
public class Assignment06_04 {
    public static void main(String []args){
        int i, j, k=2;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++)
                System.out.print(k<=i+j?"*":" ");
            System.out.println();
            k+=2;
        }
    }
}
