//7. Write a program to print greater among three numbers.
package Assignment_04;
public class Assignment04_07 {
    public static void main(String []args){
        int a=41, b=2, c=9;
        System.out.println("a="+a+" b="+b+" c="+c);
        if(a>b&&a>c)
            System.out.println(a+">"+b+"&"+c);
        else if(b>a&&b>c)
            System.out.println(b+">"+a+"&"+c);
        else
            System.out.println(c+">"+a+"&"+b);
    }
}
