//5.	Pattern 5 –
//      1
//      12
//      123
//      1234
//      12345
package Assignment_06;
public class Assignment06_05 {
    public static void main(String []args){
        int i, j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++)
                System.out.print(j<=i?j:"");
            System.out.println();
        }
    }
}
