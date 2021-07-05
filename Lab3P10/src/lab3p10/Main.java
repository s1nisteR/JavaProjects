package lab3p10;

public class Main {

    public static void main(String[] args) {
	    //Part One
        int rows = 5;
        int num = 1;
        int i = 1;
        int j;

        while(i <= rows)
        {
            j = i;
            while(j < rows)
            {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while(j <= 2 * i - 1)
            {
                System.out.print(num);
                j++;
            }
            i++;
            num++;
            System.out.println();
        }

        System.out.println();
        System.out.println();


        //Part Two
        for (int m = 1; m <= 5; m++)
        {
            int n = 5;

            for (int o = 1; o<= n - m; o++)
            {
                System.out.print(" ");
            }
            for (int k = m; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= m; l++)
            {
                System.out.print(l); } System.out.println();
            }
        for (int m = 3; m >= 1; m--)
        {
            int n = 3;

            System.out.println();
        }
    }

}
