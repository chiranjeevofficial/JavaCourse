//8. Write a program to check whether a character is an alphabet, a digit or some other character.
public class Assignment04_08 {
    public static void main(String []args){
        char c='+';
        if(c>=65&&c<=90||c>=97&&c<=122)
            System.out.println("Alphabet");
        else if(c>=48&&c<=57)
            System.out.println("Number");
        else
            System.out.println("Special Character");
    }
}
