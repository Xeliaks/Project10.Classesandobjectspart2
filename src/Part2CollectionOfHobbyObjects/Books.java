package Part2CollectionOfHobbyObjects;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;

public class Books {
    private int count;


    private ArrayList<Book> books;

    public Books() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void printOne(int i) {
        if (i >= 0 && i < books.size()) {
            System.out.println("Book you required: " + " Title: " + books.get(i).title + " Author: " + books.get(i).author +
                    " Price: " + books.get(i).getPrice() + " Year: " + books.get(i).getYear());
        } else {
            System.out.println("Book not found");
        }
    }

    public void print() {
        count = 1;
        System.out.println("Full collection of books: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book " + count + " :" + " Title: " + books.get(i).title + " Author: " + books.get(i).author +
                    " Price: " + books.get(i).getPrice() + " Year: " + books.get(i).getYear());
            count++;
        }
    }

    public int find(String s) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equalsIgnoreCase(s)) {
                System.out.println("Your book: ");
                return i;
            }
        }

        return -1;
    }

    public void sort() {
        boolean swapped;
        for (int i = 0; i < books.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < books.size() - i - 1; j++) {
                if (books.get(j).getYear() > books.get(j + 1).getYear()) {

                    Collections.swap(books, j, j + 1);

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }


    }

    public int findYear(int s) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() == s) {
                System.out.println("Your book");
                return i;
            }
        }

        return -1;
    }
}