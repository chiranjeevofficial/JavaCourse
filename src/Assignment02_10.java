//10. Write a program to rotate digits of a number towards right by one position.
public class Assignment02_10 {
    public static void main(String []args){
        int x=123, y;
        y=((x%10)*100)+(x/10);
        System.out.println("x="+x+" y="+y);
    }
}
