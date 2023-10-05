package Part2CollectionOfHobbyObjects;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Red Prince", "John Grey");
        Book book2 = new Book("Winter Witch", "Eugene White");
        Book book3 = new Book("Black Knight", "Jack Black");
        Book book4 = new Book("Purple Scarf", "Yuri Wong");
        Book book5 = new Book("Orange sands", "Alex Green");

        book1.setPrice(12.55);
        book2.setPrice(13.49);
        book3.setPrice(9.99);
        book4.setPrice(18.29);
        book5.setPrice(7.99);

        book1.setYear(2012);
        book2.setYear(2009);
        book3.setYear(2013);
        book4.setYear(2014);
        book5.setYear(2010);

        Books books = new Books();
        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);
        books.addBook(book4);
        books.addBook(book5);

        books.print();
        System.out.println();
        books.printOne(books.find("Strange"));
        System.out.println();
        books.printOne(books.find("Red Prince"));
        System.out.println();
        books.sort();
        books.print();
    }
}
