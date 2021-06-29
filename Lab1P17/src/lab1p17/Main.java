package lab1p17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");
        a = input.nextInt();

        System.out.print("Input the second number: ");
        b = input.nextInt();

        System.out.print("Input the third number: ");
        c = input.nextInt();

        System.out.printf("The result is: %b", (a + b) == c);
    }
}
