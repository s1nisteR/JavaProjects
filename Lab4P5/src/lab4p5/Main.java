package lab4p5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input elements in the first matrix :");

        int[][] mat = new int[3][3];
        for(int i = 0; i < 3; ++i)
        {
            for(int j = 0; j < 3; ++j)
            {
                System.out.printf("element - [%d],[%d]: ", i, j);
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for(int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        //find the determinant
        int determinant = (mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1])) - (mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])) + (mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]));
        System.out.println("The Determinant of the matrix is: " + determinant);
    }
}
