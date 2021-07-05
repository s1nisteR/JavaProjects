package lab3p2;

public class Main {

    public static void main(String[] args) {

        double average = 0.0;

        System.out.println("The first 20 Fibonacci numbers are:");
        for(int i = 1; i <= 20; ++i)
        {
            average += 1.0 / i;
            System.out.print(fib(i) + " ");
        }
        average = 20.0 / average;
        System.out.println("\n");
        System.out.printf("The average is %.1f", average);
    }

    public static int fib(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return (fib(n - 1) + fib(n - 2));
    }

}
