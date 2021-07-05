package lab3p6;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput;

        //Generate a random number
        Random rand = new Random();
        int random = rand.nextInt();

        System.out.println(random);
        while(true)
        {
            System.out.print("Enter Your Guess: ");
            userInput = input.nextInt();

            if(userInput > random)
            {
                System.out.println("Too high, try again.");
            }
            else if(userInput < random)
            {
                System.out.println("Too low, try again.");
            }
            else
            {
                System.out.println("Congrats!");
                break;
            }
        }
    }
}
