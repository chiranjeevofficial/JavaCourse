//6.	Pattern 6 –
//      1
//      21
//      321
//      4321
//      54321
public class Assignment06_06 {
    public static void main(String []args){
        int i, j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++)
                System.out.print(i>=j?i-j+1:"");
            System.out.println();
        }
    }
}
