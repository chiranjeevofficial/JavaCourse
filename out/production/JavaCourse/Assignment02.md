1.  Write a program to find and print unit digit of a number stored in a variable.
    ```Java
    public class Assignment02_01 {
        public static void main(String []args){
            int x=123, y;
            y=x%10;
            System.out.println("Unit digit of "+x+" is: "+y);
        }
    }
    ```

2.  Write a program to print a number stored in a variable without its last digit.
    ```Java
    public class Assignment02_02{
        public static void main(String []args){
            int x=123, y;
           y=x/10;
           System.out.println(x+" without last digit is: "+y);
       }
    }
    ```

3.  Write a program to swap values of two int variables.
    ```Java
    public class Assignment02_03 {
        public static void main(String []args){
            int a=2, b=3, c;
            System.out.println("a="+a+" b="+b);
            c=a;
            a=b;
            b=c;
            System.out.println("a="+a+" b="+b);
        }
    }
    ```

4.  Write a program to swap values of two int variables without using third variable.
    ```Java
    public class Assignment02_04 {
        public static void main(String []args){
            int a=2, b=3;
            System.out.println("a="+a+" b="+b);
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("a="+a+" b="+b);
        }
    }
    ```

5.  How to identify whether a variable is a value type variable or nullable type variables?
    - This is a plain text.

6.  Why there is an error in the Java statement – float x=3.4;
    - beacuse, every real ttype value is by default double type, there was its an error to convert double to float.
    Therfore if you wan't initialize double type value in float variable postfix **(f)** to refer as float value.
    - correct statemengt is **float x=3.4f;**

7.  What will be the result of an expression – 35&83;
    result is 3;
    Code - 
    ```Java
    System.out.println(35&83); //3
    ```

8.  What will be the result of an expression – 47|29;
    ```Java
    /*
    	128 64 32 16 8 4 2 1
    47	  0  0  1  0 1 1 1 1
    29    0  0  0  1 1 1 0 1
    ------------------------
    63    0  0  1  1 1 1 1 1
    */
    System.out.println(47|29); //63
    ```

9.  What will be the result of an expression – 76^108;

10. Write a program to rotate digits of a number towards right by one position.
    ```Java
    public class Assignment02_10 {
        public static void main(String []args){
            int x=123, y;
            y=((x%10)*100)+(x/10);
            System.out.println("x="+x+" y="+y);
        }
    }
    ```

