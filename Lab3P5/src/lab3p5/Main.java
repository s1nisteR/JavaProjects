package lab3p5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int userInput = input.nextInt();

        //Program A
        for(int i = 1; i <= userInput; ++i)
        {
            for(int j = 1; j <= i; ++j)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.println();
        System.out.println();

        //Program B
        for(int i = 0; i < userInput; ++i)
        {
            for(int k = 0; k < i; ++k)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= userInput - i; ++j)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.println();
        System.out.println();

        //Program C
        int numSpaces = 0;
        for(int i = 0; i < userInput; ++i)
        {
            //print spaces
            for(int j = userInput; j > i + 1; j--)
            {
                numSpaces++;
                System.out.print(" ");
            }
            //print the numbers
            for(int k = userInput - numSpaces; k >= 1; k--)
            {
                System.out.print(k);
            }
            numSpaces = 0;
            System.out.print("\n");
        }

        System.out.println();
        System.out.println();

        //Program D
        for(int i = 0; i < userInput; ++i)
        {
            for(int j = userInput - i; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }

    }
}
