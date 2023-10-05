package Part2CollectionOfHobbyObjects;

public class Book {



    public String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String author;

    private int  year;
    public int getYear() {
        return year;
    }

    public void setYear(int age) {
        this.year = age;
    }
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String title,String author){
        this.title = title;
        this.author = author;

    }

    public void printMainData(){
        System.out.println("Name: " + title + " Author: " + author);
    }

    public void printFullData(){
        System.out.println("Name: " + title + " Author: " + author);
        System.out.println(" Year: " + year + " Price: " + price);
    }
}
