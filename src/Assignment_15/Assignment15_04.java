package Assignment_15;
class Time{
    private short hr, min, sec;
    public Time(){
        hr=0; min=0; sec=0;
    }
    public Time(int Second){
        sec=(short)Second;
    }
    public Time(int Hour, int Minute, int Second){
        hr=(short)Hour; min=(short)Minute; sec=(short)Second;
    }
    public String toString() {
        return "HR: "+hr+" MIN: "+min+" SEC: "+sec;
    }
}
public class Assignment15_04 {
    public static void main(String[] args) {
        Time t1=new Time();
        Time t2=new Time(2);
        Time t3=new Time(10,15,55);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
