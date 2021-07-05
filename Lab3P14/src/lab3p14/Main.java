package lab3p14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        System.out.printf("Factorial is: %d", fact(n));

    }

    //Recursive factorial finding function
    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return (n * fact(n - 1));
    }
}
