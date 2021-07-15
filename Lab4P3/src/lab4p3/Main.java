package lab4p3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the rows and columns of first matrix: ");
        int row1 = input.nextInt();
        int col1 = input.nextInt();
        System.out.print("Input the rows and columns of second matrix: ");
        int row2 = input.nextInt();
        int col2 = input.nextInt();

        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int [row2][col2];

        System.out.println("Input elements in the first matrix :");
        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j < col1; j++)
            {
                System.out.printf("element - [%d],[%d]: ", i, j);
                mat1[i][j] = input.nextInt();
            }
        }

        System.out.println("Input elements in the second matrix :");
        for(int i = 0; i < row2; i++)
        {
            for(int j = 0; j < col2; j++)
            {
                System.out.printf("element - [%d],[%d]: ", i, j);
                mat2[i][j] = input.nextInt();
            }
        }

        if (row2 != col1)
        {
            System.out.println("Multiplication is not possible!");
        }
        else
        {
            int[][] answer = new int[row1][col2];

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++)
                        answer[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
            System.out.println("The first matrix is: ");
            for(int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The second matrix is: ");
            for(int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(mat2[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("The resulting matrix is: ");
            for(int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(answer[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
