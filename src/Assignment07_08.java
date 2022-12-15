import javax.print.attribute.standard.DialogTypeSelection;

//8.	Define a class Distance with fields km, m, cm. Provide methods to set distance and display distance.
//      Also define a member function to add two distances.
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
}
public class Assignment07_08 {
    public static void main(String []args){
        Distance d1=new Distance();
        d1.setDistance(2,5,20);
        d1.displayDistance();
    }
}
