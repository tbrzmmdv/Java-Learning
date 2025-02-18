package Imtahan;

import java.util.UUID;

public class Book {
    private static int count =1;
    private int id;
    private String title;
    private String author;
    private int year;
    private int avaliableCopies;

    public Book( String title, String author, int year, int avaliableCopies) {
        this.id = count++;
        this.title = title;
        this.author = author;
        this.year = year;
        this.avaliableCopies = avaliableCopies;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAvaliableCopies() {
        return avaliableCopies;
    }

    public void setAvaliableCopies(int avaliableCopies) {
        this.avaliableCopies = avaliableCopies;
    }

    boolean borrowBook(){
        if (avaliableCopies>0){
            avaliableCopies--;
            return true;
        }
        return false;
    }
    void returnBooks(){
        avaliableCopies++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", avaliableCopies=" + avaliableCopies +
                '}';
    }
}
