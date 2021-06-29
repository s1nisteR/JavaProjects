package lab1p18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        a = input.nextInt();
        System.out.print("Input second number: ");
        b = input.nextInt();
        System.out.print("Input third number: ");
        c = input.nextInt();

        if(a >= 20)
        {
            if(Math.abs(b - c) > a)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        else if(b >= 20)
        {
            if(Math.abs(a - c) > b)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        else if(c >= 20)
        {
            if(Math.abs(b - a) > c)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        else
        {
            System.out.println("false");
        }

    }
}
