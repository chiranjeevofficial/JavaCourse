// 2. Define a class MarkSheet with properties to hold marks of five subjects (like: physics, mathematics, chemistry, english and hindi). Provide setters and getters. Use Wrapper classes instead of primitives.
package Assignment_09;
class Marksheet{
    Float physics, mathematics, chemistry, english, hindi;
    void setters(Float Physics, Float Mathematics, Float Chemistry, Float English, Float Hindi){
        physics=Physics;
        mathematics=Mathematics;
        chemistry=Chemistry;
        english=English;
        hindi=Hindi;
    }
    void getters(){
        System.out.println("Physics: "+physics);
        System.out.println("Mathematics: "+mathematics);
        System.out.println("Chemistry: "+chemistry);
        System.out.println("English: "+english);
        System.out.println("Hindi: "+hindi);
    }
    // 3. In question 2, provide a method to find maximum marks.
    Float maxMarks(){
        if(physics>mathematics&&physics>chemistry&&physics>english&&physics>hindi)
            return physics;
        else if(mathematics>physics&&mathematics>chemistry&&mathematics>english&&mathematics>hindi)
            return mathematics;
        else if(chemistry>physics&&chemistry>mathematics&&chemistry>english&&chemistry>hindi)
            return chemistry;
        else if(english>physics&&english>chemistry&&english>mathematics&&english>hindi)
            return english;
        else
            return hindi;
    }
    // 4. In question 2, provide a method to find average of marks in all subjects.
    Float averageMarks(){
        return (physics+mathematics+chemistry+english+hindi)/5;
    }
    // 5. In question 2, provide a method to find result as pass or fail. Passing marks is taken as argument.
    String result(Float passingMarks){
        if(physics>=passingMarks)
            if(mathematics>=passingMarks)
                if(chemistry>=passingMarks)
                    if(english>=passingMarks)
                        if(hindi>=passingMarks)
                            return "Pass";
        return "Fail";
    }
}
public class Assignment09_02 {
    public static void main(String[] args) {
        Marksheet m=new Marksheet();
        m.setters(56f, 73f, 33f, 66f, 55f);
        m.getters();
        System.out.println("Maximum Marks is: "+m.maxMarks());
        System.out.println("Average Marks of all Subjects: "+m.averageMarks());
        System.out.println("Result: "+m.result(33f));
    }
}
