package jokerenderer;


interface Shape
{
    void render();
}

class Triangle implements Shape
{
    Triangle()
    {
    }

    public void render()
    {
        System.out.println("Rendering Triangle...");
    }
}

class Circle implements Shape
{
    Circle()
    {
    }

    public void render()
    {
        System.out.println("Rendering Circle...");
    }
}

class Rectangle implements Shape
{
    Rectangle()
    {
    }

    public void render()
    {
        System.out.println("Rendering Rectangle...");
    }
}

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        c.render();
        t.render();
        r.render();

        //Will throw an error since can't instantiate objects from an interface
        //Shape test = new Shape();

    }
}
