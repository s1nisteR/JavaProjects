package lab4p14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first String: ");
        String first = input.next();
        System.out.print("Input the second String: ");
        String second = input.next();

        if(first.length() != second.length())
        {
            System.out.println(first + " " + second + " are not anagrams.");
        }
        else
        {
            char[] arr1 = first.toLowerCase().toCharArray();
            char[] arr2 = second.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2))
            {
                System.out.println(first + " " + second + " are anagrams.");
            }
            else
            {
                System.out.println(first + " " + second + " are not anagrams.");
            }
        }
    }
}
