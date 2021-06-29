package lab1p10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        System.out.println(((a + b + c) / 3));
    }
}
