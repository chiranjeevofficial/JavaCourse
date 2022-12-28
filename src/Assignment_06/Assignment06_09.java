//9.	Pattern 9 –
//      ABCDE
//      BCDE
//      CDE
//      DE
//      E
package Assignment_06;
public class Assignment06_09 {
    public static void main(String []args){
        char i, j;
        for(i='A';i<='E';i++){
            for(j='A';j<='E';j++)
                System.out.print(i<=j?j:"");
            System.out.println();
        }
    }
}
