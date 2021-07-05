package lab3p13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int userInput = input.nextInt();

        for(int i = 0; i <= userInput - 1; ++i)
        {
            for(int j = 0; j <= userInput - i; ++j)
            {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; ++j)
            {
                System.out.print(" " + nCr(i, j));
            }
            System.out.print("\n");
        }

    }

    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int nCr(int n, int r)
    {
        return (fact(n) / (fact(n - r) * fact(r)));
    }
}
