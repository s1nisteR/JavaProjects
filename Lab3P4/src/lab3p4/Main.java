package lab3p4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int userInput = input.nextInt();

        //Program A
        int k = 0;
        for(int i = 1; i <= userInput; i++, k = 0)
        {
            //print the spaces
            for(int j = 1; j <= userInput - i; ++j)
            {
                System.out.print(" ");
            }
            //print the symbols
            while(k != 2 * i - 1)
            {
                System.out.print("*");
                k++;
            }
            System.out.print("\n");
        }
        System.out.println();
        System.out.println();


        //Program B
        for(int i = userInput; i >= 1; i--)
        {
            //print the spaces
            for(int j = 1; j <= userInput - i; ++j)
            {
                System.out.print(" ");
            }

            //print the symbols
            for(int m = i; m <= 2 * i - 1; ++m)
            {
                System.out.print("*");
            }
            for(int n = 0; n < i - 1; ++n)
            {
                System.out.print("*");
            }

            //print a newline
            System.out.print("\n");
        }

    }
}
