package lab1p12;

public class Main {

    public static void main(String[] args) {
	    //Different ways to swap two variables

        //First way is to have a temp variable
        int a = 12;
        int temp;
        int b = 13;
        //In order to swap
        temp = a;
        a = b;
        b = temp;
        System.out.printf("a: %d, b: %d\n", a, b);

        //Second way is to use arithmetic operations to swap variables
        int m = 24;
        int n = 25;
        //In order to swap
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.printf("m: %d, n: %d\n", m, n);

        //Third way is to use bitwise xor operator
        int x = 2;
        int y = 3;
        //In order to swap
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.printf("x: %d, y: %d", x, y);

    }
}
