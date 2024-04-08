package Hondana.Hondana.books;

import java.time.LocalDate;

public class Books {
    private int id;
    private int ISBN;
    private String title;
    private String desc; //Description
    private double rating;
    private LocalDate relDate; //release date

    public Books(){

    }

    public Books(int id,
                 int ISBN,
                 String title,
                 String desc,
                 double rating,
                 LocalDate relDate) {
        this.id = id;
        this.ISBN = ISBN;
        this.title = title;
        this.desc = desc;
        this.rating = rating;
        this.relDate = relDate;
    }

    public Books(int ISBN,
                 String title,
                 String desc,
                 double rating,
                 LocalDate relDate) {
        this.ISBN = ISBN;
        this.title = title;
        this.desc = desc;
        this.rating = rating;
        this.relDate = relDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDate getRelDate() {
        return relDate;
    }

    public void setRelDate(LocalDate relDate) {
        this.relDate = relDate;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", rating=" + rating +
                ", relDate=" + relDate +
                '}';
    }
}
