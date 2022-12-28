//3.	Pattern 3 –
//      *****
//      ****
//      ***
//      **
//      *
package Assignment_06;
public class Assignment06_03 {
    public static void main(String []args){
        int i, j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++)
                System.out.print(i+j<=6?"*":"");
            System.out.println();
        }
    }
}
