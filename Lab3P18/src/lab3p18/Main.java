package lab3p18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = input.nextInt();
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.printf("%d is a leap year", year);
                }
                else
                {
                    System.out.printf("%d is not a leap year", year);
                }
            }
            else
            {
                System.out.printf("%d is a leap year", year);
            }
        }
        else
        {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
