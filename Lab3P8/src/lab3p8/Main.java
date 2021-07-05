package lab3p8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        boolean isPalindrome = true;

        char[] arr = userInput.toCharArray();

        int length = arr.length;

        if(arr.length % 2 == 0) //even
        {
            for(int i = 0; i < arr.length / 2; ++i)
            {
                if(arr[i] != arr[length - i - 1])
                {
                    isPalindrome = false;
                    break;
                }
            }
        }
        else //odd
        {
            for(int i = 0; i < arr.length / 2; ++i)
            {
                if(arr[i] != arr[arr.length - i - 1])
                {
                    isPalindrome = false;
                    break;
                }
            }
        }
        if(isPalindrome)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
