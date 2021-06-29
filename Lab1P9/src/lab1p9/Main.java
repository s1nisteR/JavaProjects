package lab1p9;

import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Radius = ");
        double a = input.nextDouble();
        System.out.println("Perimeter is = " + (2 * Math.PI * a));
        System.out.println("Area is = " + (Math.PI * Math.pow(a, 2)));
    }
}
