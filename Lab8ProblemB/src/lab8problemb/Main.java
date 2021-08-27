package lab8problemb;

import java.util.Scanner;

class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

class Product
{
    void productCheck(int weight) throws MyException
    {
        if(weight < 100)
        {
            throw new MyException("Product is invalid");
        }
        System.out.println("Weight: " + weight);
    }
}

public class Main {

    public static void main(String[] args) {
        Product first = new Product();
        Scanner inp = new Scanner(System.in);
        try
        {
            first.productCheck(20);
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
