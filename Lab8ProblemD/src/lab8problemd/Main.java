package lab8problemd;




public class Main {

    public static void main(String[] args) {
        try
        {
            try
            {
                System.out.println("going to divide");
                int b =39/0;
            }

            catch(ArithmeticException e)
            {
                System.out.println(e);
            }

            try
            {
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("other statement");

        }
        catch(Exception e)  //this catch is never called because all exceptions have been handled
        {
            System.out.println("handled");  //this code never executes(skipped)
        }
        System.out.println("normal flow..");    //this is the last line of the output
    }
}
