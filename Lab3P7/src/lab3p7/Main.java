package lab3p7;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 7; ++i)
        {
            for(int j = 1; j <= i; ++j)
            {
                System.out.print(j);
            }
            for(int k = 0; k < 7 - i; ++k)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
