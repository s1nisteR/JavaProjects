package lab3p20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x: ");
        double x = input.nextDouble();
        System.out.print("Input n: ");
        int n = input.nextInt();
        double result = 0.0f;

        for(int i = 0; i <= n; i++)
        {
            result += (Math.pow(-1.0f, i) / (double)fact(2 * i)) * Math.pow(x, (2 * i));
        }

        System.out.println("Result: " + result);
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
