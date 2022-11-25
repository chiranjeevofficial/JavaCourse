/*
        Grading System in an exam is as follows:
        Marks	Grade
        90-100	A
        80-89	B
        70-79	C
        60-69	D
        50-59	E
        x<50	F
        Write a Java program to calculate grade for the
        given marks obtained in exam by a candidate.
*/
public class Assignment02_GradingSystem {
    public static void main(String []args){
        int marks=60;

        if(marks>=90)
            System.out.println("A Grade");
        else if(marks>=80)
            System.out.println("B Grade");
        else if(marks>=70)
            System.out.println("C Grade");
        else if(marks>=60)
            System.out.println("D Grade");
        else if(marks>=50)
            System.out.println("E Grade");
        else
            System.out.println("F Grade");
    }
}
