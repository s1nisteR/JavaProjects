package lab4p4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of the square matrix: ");
        int n = input.nextInt();
        int sum = 0;
        int[][] mat = new int[n][n];

        System.out.println("Input elements in the first matrix :");
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                System.out.printf("element - [%d],[%d]: ", i, j);
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if(i == j)
                    sum += mat[i][j];
            }
        }

        System.out.println("Addition of the right Diagonal elements is: " + sum);
    }
}
