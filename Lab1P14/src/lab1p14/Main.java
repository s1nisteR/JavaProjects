package lab1p14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String number = "";
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");

        number = Integer.toString(input.nextInt());
        //convert to a char array for easier iteration
        char[] chars = number.toCharArray();
        for(char ch : chars)
        {
            sum += ch - 48;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
