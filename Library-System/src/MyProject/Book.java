package MyProject;
public class Book {
    private String tittle;
    private String author;
    private int year;
    public Book(String tittle, String author, int year){
        this.tittle = tittle;
        this.author = author;
        this.year = year;
    }
    public String getTittle(){
        return tittle;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
}