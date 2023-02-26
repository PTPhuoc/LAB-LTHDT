package LAB;

public class Student {
    String stID ;
    String stName ;
    String stClass ;

    public String getStID(){
        return stID;
    }

    public String getStName(){
        return stName;
    }

    public String getStClass(){
        return stClass;
    }

    public void setStname(String stName){
        this.stName = stName;
    }

    public void setStID(String stID){
        this.stID = stID;
    }

    public void setStCLass(String stClass){
        this.stClass = stClass;
    }

    public String toString(){
        return "ID "+ getStID() + ",Name " + getStName() + ",Class " + getStClass() ;
    }

    public void student(String stID, String stName, String stClass){
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
        toString();
    }
}
