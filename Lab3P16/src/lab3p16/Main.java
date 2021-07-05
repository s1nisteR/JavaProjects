package lab3p16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int spaces = 1;
        int start = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int userInput = input.nextInt();

        int count = 1;

        for (int i = 1; i < (userInput * 2); i++)
        {

            for (int j = userInput - spaces; j > 0; j--)
            {
                System.out.print(" ");
            }
            if (i < userInput)
            {
                start = i;
                spaces++;
            } else
            {
                start = userInput * 2 - i;
                spaces--;
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print(start);
                if (j < count / 2)
                {
                    start--;
                } else
                {
                    start++;
                }
            }
            if (i < userInput)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }


    }
}
