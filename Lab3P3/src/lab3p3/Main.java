package lab3p3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int userInput = input.nextInt();
        for(int i = 0; i < userInput; ++i)
        {
            for(int j = 0; j < userInput; ++j)
            {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
