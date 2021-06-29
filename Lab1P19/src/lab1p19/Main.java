package lab1p19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;
        int temp;
        boolean found = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        a = input.nextInt();
        System.out.print("Input the second number: ");
        b = input.nextInt();

        while(a > 0)
        {
            temp = a % 10;
            a /= 10;
            while(b > 0)
            {
                if(temp == b % 10)
                {
                    found = true;
                    break;
                }
                b /= 10;
            }
        }
        if(found)
        {
            System.out.println("Result: true");
        }
        else
        {
            System.out.println("Result: false");
        }

    }
}
