package lab3p15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        int reverse = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number: ");
        num = input.nextInt();

        do
        {
            reverse *= 10;
            reverse += num % 10;
            num /= 10;
        }while(num != 0);

        System.out.printf("The reversed number is: %d", reverse);
    }
}
