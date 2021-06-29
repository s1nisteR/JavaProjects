package lab1p4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(nextPrime(input.nextInt()));
    }

    static int nextPrime(int n)
    {
        int next = 0;
        if(isPrime(n))
        {
            return n;
        }
        else
        {
            for(int i = n + 1; ; ++i)
            {
                if (isPrime(i))
                {
                    next = i;
                    break;
                }
            }
            return next;
        }
    }


    static boolean isPrime(int n)
    {
        if(n < 2) return false;
        for(int x = 2; x*x <= n; ++x)
        {
            if(n % x == 0) return false;
        }
        return true;
    }
}
