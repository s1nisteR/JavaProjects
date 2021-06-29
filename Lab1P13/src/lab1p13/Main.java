package lab1p13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Input first integer: ");
        a = input.nextInt();
        System.out.print("Input second integer: ");
        b = input.nextInt();

        //Check equality first, then less than, less than equal to, then greater than, greater than equal to
        if(a == b)
        {
            System.out.printf("%d = %d\n", a, b);
        }
        if(a != b)
        {
            System.out.printf("%d != %d\n", a, b);
        }
        if(a < b)
        {
            System.out.printf("%d < %d\n", a, b);
        }
        if(a <= b)
        {
            System.out.printf("%d <= %d\n", a, b);
        }
        if(a > b)
        {
            System.out.printf("%d > %d\n", a, b);
        }
        if(a >= b)
        {
            System.out.printf("%d >= %d\n", a, b);
        }
    }
}
