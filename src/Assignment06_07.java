//7.	Pattern 7 –
//      ABCDE
//       ABCD
//        ABC
//         AB
//          A
public class Assignment06_07 {
    public static void main(String []args){
        char i, j, k=0;
        for(i='A';i<='E';i++){
            for(j='A';j<='E';j++)
                System.out.print(i<=j?(char)(j-k):" ");
            System.out.println();
            k++;
        }
    }
}
