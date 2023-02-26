package LAB;

public class Triangle {
    float width = 0.0f;
    float heigth = 0.0f;

    public float getWidth(){
        return width;
    }

    public float getHeigth(){
        return heigth;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void setHeigth(float heigth){
        this.heigth = heigth;
    }

    public String toString(){
        return "Triange[width = " + getWidth() + ", height "+ getHeigth() +"]";
    }

    public void triangle(float width,float heigth){
        this.width = width;
        this.heigth = heigth;
        toString();
    }
}
