//2.	Define a class Time to represent Time (like 3HR 45MIN 20SEC). Declare ap-propriate number of
//      instance member variables and also define instance member function to set values for
//      time and display values of time.
class Time{
    int hour, min, sec;
    void SetTime(int Hour, int Minute, int Second){
        hour=Hour;
        min=Minute;
        sec=Second;
    }
    void ShowTime(){
        System.out.print(hour+"HR "+min+"MIN "+sec+"SEC");
    }
}
public class Assignment07_02 {
    public static void main(String []args){
        Time t1=new Time();
        t1.SetTime(3,45,20);
        t1.ShowTime();
    }
}
