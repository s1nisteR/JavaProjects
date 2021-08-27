package lab8problema;


import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator
{
    private int a;
    private int b;

    Calculator(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int Add()
    {
        try
        {
            if(this.a < 0 || this.b < 0)
            {
                throw new ArithmeticException();
            }
            else
            {
                return this.a + this.b;
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("One or more of the numbers were negative!");
        }
        return -1;
    }

    public int Subtract()
    {
        try
        {
            if(this.a < 0 || this.b < 0)
            {
                throw new ArithmeticException();
            }
            else
            {
                return this.a - this.b;
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("One or more of the numbers were negative!");
        }
        return -1;
    }

    public int Multiply()
    {
        try
        {
            if(this.a == 0 || this.b == 0)
            {
                throw new ArithmeticException();
            }
            else
            {
                return this.a * this.b;
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("One or more of the numbers were zero!");
        }
        return -1;
    }

    public double Divide()
    {
        try
        {
            if(this.a == 0 || this.b == 0)
            {
                throw new ArithmeticException();
            }
            else
            {
                return (double)this.a / (double)this.b;
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("One or more of the numbers were zero!");
        }
        return -1;
    }

}


public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try
        {
            System.out.print("Enter First Number: ");
            try
            {
                int a = inp.nextInt();
                System.out.print("Enter Second Number: ");
                int b = inp.nextInt();
                Calculator obj1 = new Calculator(a, b);
                System.out.println(obj1.Add());
            }
            catch(Exception e)
            {
                throw new NumberFormatException();
            }

            try
            {
                System.out.print("Enter First Number: ");
                int a = inp.nextInt();
                System.out.print("Enter Second Number: ");
                int b = inp.nextInt();
                Calculator obj2 = new Calculator(a, b);
                System.out.println(obj2.Subtract());
            }
            catch(Exception e)
            {
                throw new NumberFormatException();
            }

            try
            {
                System.out.print("Enter First Number: ");
                int a = inp.nextInt();
                System.out.print("Enter Second Number: ");
                int b = inp.nextInt();
                Calculator obj3 = new Calculator(a, b);
                System.out.println(obj3.Multiply());
            }
            catch(Exception e)
            {
                throw new NumberFormatException();
            }

            try
            {
                System.out.print("Enter First Number: ");
                int a = inp.nextInt();
                System.out.print("Enter Second Number: ");
                int b = inp.nextInt();
                Calculator obj4 = new Calculator(a, b);
                System.out.println(obj4.Divide());
            }
            catch(Exception e)
            {
                throw new NumberFormatException();
            }

        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Input!");
        }


    }
}
