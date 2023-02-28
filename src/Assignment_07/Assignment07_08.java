//8.	Define a class Distance with fields km, m, cm. Provide methods to set distance and display distance.
//      Also define a member function to add two distances.
package Assignment_07;
class Distance{
    float km, m, cm;
    void setDistance(float KiloMeter, float Meter, float CentiMeter){
        km=KiloMeter;
        m=Meter;
        cm=CentiMeter;
    }
    void displayDistance(){
        System.out.println(km+"KM "+m+"MM "+cm+"CM");
    }
    public Distance addTwoDistance(Distance d){
        Distance temp=new Distance();
        temp.cm=cm+d.cm;
        temp.m=temp.cm/100+m+d.m;
        temp.km=temp.m/1000+km+d.km;
        return temp;
    }
}
public class Assignment07_08 {
    public static void main(String []args){
        Distance d1=new Distance();
        Distance d2=new Distance();
        d1.setDistance(2,5,20);
        d1.setDistance(3,3,10);
        d1.displayDistance();
        d1.displayDistance();
    }
}
