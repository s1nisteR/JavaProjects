package lab4p13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int inp = input.nextInt();
        System.out.printf("Answer is %d", fact(inp));

    }

    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * fact(n - 1);
    }
}
