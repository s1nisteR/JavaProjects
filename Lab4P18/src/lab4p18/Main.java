package lab4p18;


class Author
{
    String firstName;
    String lastName;

    //Parameterized Constructor (Default)
    public Author(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }

    //setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    //methods
    public String toString()
    {
        return (this.firstName + " " + this.lastName);
    }

}

class Book
{
    String title;
    Author author;
    double price;

    public Book (String title, Author name, double price)
    {
        this.title = title;
        this.author = name;
        this.price = price;
    }

    //getters
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author.toString(); }
    public double getPrice() { return this.price; }

    //setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(Author author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }

    //methods
    public String toString()
    {
        return ("Title: " + this.title +  "\nAuthor: " + this.author.toString() + "\nPrice: " + this.price);
    }
}


public class Main {

    public static void main(String[] args) {
        Author authorOne = new Author("Russel", "Winderand");
        Book bookOne = new Book("Developing Java Software", authorOne, 79.75);
        System.out.println(bookOne.toString());
    }
}
