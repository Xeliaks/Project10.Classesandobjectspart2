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
    //Part 2.1 This class should have private properties and corresponding getters and setters.
    private boolean eligibility;
    public boolean isEligibility() {
        return eligibility;
    }

    public void setEligibility(boolean eligibility) {
        this.eligibility = eligibility;
    }
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
    //Part2.2 This class should have constructor with initial values for the main properties.
    public Book(){
        title = "NoTitle";
        author = "Unknown";
    }
    //Part2.3 The class should have methods which perform a logic on the base of its properties.
    public void printMainData(){
        System.out.println("Name: " + title + " Author: " + author);
    }

    public void printFullData(){
        System.out.println("Name: " + title + " Author: " + author);
        System.out.println("Eligibility: " + eligibility + " Year: " + year + " Price: " + price);
    }
}
