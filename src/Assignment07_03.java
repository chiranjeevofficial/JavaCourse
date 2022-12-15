//3.	Define a class Cuboid with member variables to store length of its sides. Al-so define setters,
//      getters and member functions to calculate volume and surface area of cuboid.
class Cuboid{
    int l, w, h;
    void setters(int Length, int Width, int Height){
        l=Length;
        w=Width;
        h=Height;
    }
    void getters(){
        System.out.println("Length: "+l+" Width: "+w+" Height "+h);
    }
    int volumeOfCuboid(){
        return l*w*h;
    }
    int surfaceOfCuboid(){
        return 2*(l*w+w*h+h*l);
    }
}
public class Assignment07_03 {
    public static void main(String []args){
        Cuboid c1=new Cuboid();
        c1.setters(2,4, 5);
        c1.getters();
        System.out.println("Volume of Cuboid: "+c1.volumeOfCuboid());
        System.out.println("Surface of Cuboid: "+c1.surfaceOfCuboid());
    }
}
