package lab1p11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Width = ");
        double a = input.nextDouble();
        System.out.print("Height = ");
        double b = input.nextDouble();
        //Printing everything in 2 decimal places
        System.out.printf("Area is %.2f * %.2f = %.2f\n", a, b, (a * b));
        System.out.printf("Perimeter is 2 * (%.2f + %.2f) = %.2f\n", a, b, (2 * (a + b)));

    }
}
