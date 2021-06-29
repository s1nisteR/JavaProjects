package lab1p8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(primeNumbers(input.nextInt()));

    }

    static int primeNumbers(int n)
    {
        int counter = 0;
        for(int i = 2; i <= n; ++i)
        {
            if(isPrime(i))
            {
                counter++;
            }
        }
        return counter;
    }


    static boolean isPrime(int n)
    {
        if(n < 2) return false;
        for(int x = 2; x * x <= n; x++)
        {
            if(n % x == 0)
            {
                return false;
            }
        }
        return true;
    }
}
