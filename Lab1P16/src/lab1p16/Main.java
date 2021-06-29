package lab1p16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println(rev(a));
    }

    static int rev(int n)
    {
        if(n < 0)
        {
            n *= -1;
        }
        int reverse = 0;
        while(n > 0)
        {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return reverse;
    }

}
