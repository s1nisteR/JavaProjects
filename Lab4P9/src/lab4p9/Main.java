package lab4p9;

public class Main {

    public static void main(String[] args) {
        int answer = 0;
        for(int i = 1; i <= 5; ++i)
        {
            answer += fact(i) / i;
        }

        System.out.println("The sum of the series is: " + answer);
    }

    public static int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * fact(n - 1);
    }
}
