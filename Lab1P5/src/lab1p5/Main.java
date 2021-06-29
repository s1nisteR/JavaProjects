package lab1p5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = input.nextInt();
        System.out.print("Input second number: ");
        b = input.nextInt();

        System.out.println(a + " x " + b + " = " + (a * b));
    }
}
