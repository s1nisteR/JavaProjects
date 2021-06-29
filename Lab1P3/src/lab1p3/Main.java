package lab1p3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(gcd(a, b));
    }


    //recursive gcd function
    static int gcd(int a, int b)
    {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
