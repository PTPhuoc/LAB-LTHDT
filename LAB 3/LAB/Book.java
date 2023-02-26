package LAB;

public class Book {
    String boCode;
    String boTitle;
    String boAuthor;

    public String getBocode(){
        return boCode;
    }

    public String getBoTitle(){
        return boTitle;
    }

    public String getBoAuthor(){
        return boAuthor;
    }

    public Book(Book bo){
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public void book(String boCode, String boTitle, String boAuthor){
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
}
