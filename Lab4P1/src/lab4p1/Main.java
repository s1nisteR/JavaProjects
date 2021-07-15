package lab4p1;

public class Main {

    public static void main(String[] args) {

        //our test array on which we apply bubble sort
        int[] test = { 5, 6, 10, 2, 19, 3, 3, 0, -20};

        int n = test.length;
        boolean swapped;
        int temp;

        for(int i = 0; i < n - 1; ++i)
        {
            swapped = false;

            for(int j = 0; j < n - 1; ++j)
            {
                if(test[j] > test[j + 1])
                {
                    temp = test[j];
                    test[j] = test[j + 1];
                    test[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }


        for(int x : test)
        {
            System.out.println(x);
        }
    }
}
