package lab5p2;


import java.util.Arrays;
import java.util.Scanner;

class Book implements Comparable<Book>
{
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private int count;

    //constructors
    Book()
    {
        this.ISBN = 0;
        this.bookTitle = "";
        this.numberOfPages = 0;
        this.count = 0;
    }
    Book(int ISBN, String bookTitle, int numberOfPages, int count)
    {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
        this.count = count;
    }

    //getters
    public int getCount() { return this.count; }
    public int getNumberOfPages() { return this.numberOfPages; }

    //methods
    public String toString()
    {
        return "ISBN: " + this.ISBN + "\nBook Title: " + this.bookTitle + "\nNumber of Pages: " + this.numberOfPages + "\nCount: " + this.count;
    }

    public static void displayAll(Book[] arr)
    {
        for(Book x : arr)
        {
            System.out.println(x);
            System.out.println();
        }
    }

    @Override
    public int compareTo(Book o)
    {
        if(this.numberOfPages > o.numberOfPages)
        {
            System.out.println(1);
            return 1;
        }
        else if(this.numberOfPages == o.numberOfPages)
        {
            System.out.println(0);
            return 0;
        }
        else
        {
            System.out.println(-1);
            return -1;
        }
    }

    public static boolean isHeavier(Book o)
    {
        return o.numberOfPages > 500;
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ISBN;
        String title;
        int pages;
        int count;

        Book[] arr = new Book[5];

        for(int i = 0; i < 5; ++i)
        {
            System.out.print("Enter ISBN: ");
            ISBN = input.nextInt();
            input.nextLine();   //skip newline char such that string can be taken after input
            System.out.print("Enter Book Title: ");
            title = input.nextLine();
            System.out.print("Enter Number of Pages: ");
            pages = input.nextInt();
            System.out.print("Enter Count: ");
            count = input.nextInt();

            arr[i] = new Book(ISBN, title, pages, count);
        }


        //sorting to test compareTo method
        Arrays.sort(arr);

        //displaying info about all books in the array
        Book.displayAll(arr);

        if(Book.isHeavier(arr[4]))
        {
            System.out.println("The final book is heavy");
        }
        else
        {
            System.out.println("The final book is not heavy");
        }

    }
}
