package LAP;

public class Cylinder extends Cirlce{
    public double height;

    public double getHeight(){
        return this.height;
    }

    public double setHeight(double height){
        return this.height = height;
    }

    public double getVolume(){
        return super.getArea() * getHeight();
    }
}
