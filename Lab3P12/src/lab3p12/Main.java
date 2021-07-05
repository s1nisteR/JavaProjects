package lab3p12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;

        int greatest = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        for(int i = 1; i <= Math.max(a, b); ++i)
        {
            if(a % i == 0 && b % i == 0)
            {
                greatest = i;
            }
        }

        System.out.printf("GCF is: %d", greatest);
    }
}
