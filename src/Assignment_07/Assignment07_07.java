//7.	Define a class Course with fields courseId, courseName, duration, fee. Pro-vide setters and getters.
package Assignment_07;
class Course{
    int courseId, duration;
    float fees;
    String courseName;
    void setters(int CourseID, String CourseName, int Duration, float Fees){
        courseId=CourseID;
        courseName=CourseName;
        duration=Duration;
        fees=Fees;
    }
    void getters(){
        System.out.println("CourseID: "+courseId);
        System.out.println("CourseName: "+courseName);
        System.out.println("Duration(in months): "+duration);
        System.out.println("Fees: "+fees);
    }
}
public class Assignment07_07 {
    public static void main(String []args){
        Course c1=new Course();
        c1.setters(1201,"Java",4,3500);
        c1.getters();
    }
}
