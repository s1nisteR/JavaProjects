package lab1p20;


import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Sieve of Eratosthenes is used to generate first 1000 primes from which the sum of first 100 prime numbers is found
        boolean[] temp = new boolean[10000000];
        Arrays.fill(temp, true);
        temp[0] = false;
        temp[1] = false;


        int sum = 0;
        int counter = 0;

        int[] primes = new int[1000]; //first 1000 prime numbers to be stored here

        //Generate the primes
        for(int i = 2; i <= 1000; i++)
        {
            if(temp[i])
            {
                for(int j = i * i; j <= 1000; j += i)
                {
                    temp[j] = false;
                }
                primes[counter] = i;
                counter++;
            }
        }

        //Sum of first 100 prime numbers
        for(int i = 0; i < 100; ++i)
        {
            sum += primes[i];
        }

        System.out.printf("Sum of the first 100 prime numbers: %d", sum);
    }
}
