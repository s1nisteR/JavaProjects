//solution of question vi)

package lab7questions2;

class Shape
{
    Shape()
    {

    }

    public void print()
    {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape
{
    Rectangle()
    {
        super();
    }

    public void printRect()
    {
        System.out.println("This is a rectangular shape");
    }
}

class Circle extends Shape
{
    Circle()
    {
        super();
    }

    public void printCircle()
    {
        System.out.println("This is a circular shape");
    }
}

class Square extends Rectangle
{
    Square()
    {
        super();
    }

    public void printSquare()
    {
        System.out.println("Square is a rectangle");
    }
}

public class Main {

    public static void main(String[] args) {
        Square first = new Square();
        first.print();
        first.printRect();
    }
}
