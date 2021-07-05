package lab3p11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double answer = 0;

        for(int i = 1; i <= n; ++i)
        {
            answer += 1.0 / i;
        }

        System.out.println(answer);
    }
}
