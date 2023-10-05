package Part2CollectionOfHobbyObjects;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Books {

    private int count;



    private ArrayList<Book> books;
    public Books(){
        books = new ArrayList<>();
    }

    public void addBook(Book b){
        books.add(b);
    }

    public void printOne(int i){
        System.out.println("Book you required: " + books.get(i));
    }

    public void print(){
        count = 1;
        System.out.println("Full collection of books: ");
        for (int i=0;i<books.size();i++){
            System.out.println("Book " + count + " :" + books.get(i));
            count++;
        }
    }

    public Book find(String s){
        for (int i=0;i< books.size();i++){
            if (books.get(i).title.equalsIgnoreCase(s)){
                System.out.println("Your book");
                return books.get(i);
            }
        }
        System.out.println("Book not found");
        return null;
    }

    public void sort(){
        int temp;
        boolean swapped;
        for (int i = 0; i < books.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < books.size() - i - 1; j++) {
                if (books.get(j).getYear() > books.get(j+1).getYear()) {


                    temp = books.get(j).getYear();
                    books.get(j+1).setYear(books.get(j).getYear());
                    books.get(j).setYear(temp);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }


    }

    public Book findYear(int s){
        for (int i=0;i< books.size();i++){
            if (books.get(i).getYear() == s){
                System.out.println("Your book");
                return books.get(i);
            }
        }
        System.out.println("Book not found");
        return null;
    }



}
