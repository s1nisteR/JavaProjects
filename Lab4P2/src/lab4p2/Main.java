package lab4p2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Input 5 elements in the array (value must be <9999)");
        for(int i = 0; i < size; ++i)
        {
            System.out.print("element - " + i + ": ");
            arr[i] = input.nextInt();
        }

        //sort the array
        Arrays.sort(arr);

        //print the second smallest element

        System.out.println("The Second smallest element in the array is : " + arr[1]);
    }
}
