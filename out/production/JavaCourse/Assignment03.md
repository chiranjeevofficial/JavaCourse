1.  Write a program with one char type variable. Assign ‘A’ in the variable. Now change the value of variable from ‘A’ to ‘B’ using increment operator?
    ```Java
        public class Assignment03_01 {
            public static void main(String []args){
                char ch='A';
                ch=++ch;
                System.out.println(ch); //B
            }
        }
    ```

2.  Write a program to find unicode of the character ‘+’?
    ```Java
    public class Assignment03_02 {
        public static void main(String []args){
            int temp='+';
            System.out.println("Unicode of + is: "+temp);   //43
        }
    }
    ```

3.  Write a program to make the last digit of a number stored in a variable as zero. (Example – if x=2345 then make it x=2340)
    ```Java
    public class Assignment03_03 {
        public static void main(String []args){
            int x=2345;
            x=x/10*10;
            System.out.println(x);  //2340
        }
    }
    ```

4.  Write a program to calculate sum of the digits of a given number.
    ```Java
    public class Assignment03_04 {
        public static void main(String []args){
            int x=123, sum;
            sum=x%10;   //sum=3
            x/=10;      //x=12
            sum+=x%10;  //sum=5
            x/=10;      //x=1
            sum+=x%10;  //sum=6
            x/=10;      //x=0
            System.out.println(sum); //sum=6
        }
    }
    ```

5. What will be the result of an expression – 5>4>3?
    - because, its not sutaible type to compare the value
    ```Java
    public class Assignment03_05 {
        public static void main(String []args){
            System.out.println(5>4>3);  //error
        }
    }
    //    JavaCourse\src\Assignment03_05.java:4:31
    //    java: bad operand types for binary operator '>'
    //    first type:  boolean
    //    second type: int
    ```

6.  What will be the value get stored in variable x as a result of an expression – int x=(int)true;
    - error, this is inconvertible type.

7.  What will be the value get stored in variable x as a result of an expression – int x=!5>-2;
    - error, !(not) is a logical operator & its operand only true or false
    - Step 1: !5 is a error, but !(5>-2) is an expression
    ```Java
    System.out.println(!(5>-2));    //false
    ```

8.  What will be the value get stored in variable x as a result of an expression – int x=5.5%1.5;
    ```Java
    System.out.println(5.5%1.5);    //1.0
    ```

9.  Write a program to reverse a three-digit number.
    ```Java
    public class Assignment03_09 {
        public static void main(String []args){
            int x=123, rev=0;
            rev=(rev+(x%10))*10;
            x/=10;
            rev=(rev+(x%10))*10;
            x/=10;
            rev=rev+(x%10);
            System.out.println(rev);    //321
        }
    }
    ```

10. Write a program to print the character corresponding to the unicode 100
    ```Java
    public class Assignment03_10 {
        public static void main(String []args){
            char ch=(char)100;
            System.out.println("Character corresponding of 100 is: "+ch);   //d
        }
    }
    ```