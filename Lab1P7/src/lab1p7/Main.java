package lab1p7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        n = input.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
