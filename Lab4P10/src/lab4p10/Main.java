package lab4p10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input any number: ");
        int inp = input.nextInt();

        //Armstrong number is a number that is equal to the sum of cubes of its digits
        int answer = 0;
        int num = inp;
        while(num > 0)
        {
            answer += Math.pow(num % 10, 3);
            num /= 10;
        }
        if(inp == answer)
        {
            System.out.println("The number " + inp + " is an Armstrong number");
        }
        else
        {
            System.out.println("The number " + inp + " is not an Armstrong number");
        }

        //Perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself
        answer = 0;
        for (int i = 1; i*i < inp; i++)
        {
            if(inp % i == 0 && i != inp)
            {
                answer += i;
            }
        }
        for (int i = (int)Math.sqrt(inp); i >= 1; i--)
        {
            if (inp % i == 0 && (inp / i != inp))
            {
                answer += inp / i;
            }
        }
        if(inp == answer)
        {
            System.out.println("The number " + inp + " is a Perfect number");
        }
        else
        {
            System.out.println("The number " + inp + " is not a Perfect number");
        }


    }
}
