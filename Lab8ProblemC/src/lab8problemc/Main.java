package lab8problemc;

public class Main {

    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            //System.out.println(a[10]);
            //This code will throw ArrayIndexOutOfBoundsException

            //a[5]=30/0;                    // This will throw ArithmeticException
            //System.out.println(a[10]);    // This will throw ArrayIndexOutOfBoundsException
            //if it is part of a single code block, first a[5]=30/0; will throw an ArithmeticException and the line
            //System.out.println(a[10]); will not be executed anymore hence not throwing a further ArrayIndexOutOfBoundsException

            //String s=null;
            //System.out.println(s.length()); //This will throw the general Exception, hence printing "Parent Exception occurs"


        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");

        try
        {
            int[] a=new int[5];
            a[5]=30/0;
        }
        catch(Exception e)
        {
            System.out.println("common task completed");
        }
        /* EXCEPTION HAS ALREADY BEEN CAUGHT FOR THE FINAL TWO CASES
        catch(ArithmeticException e)
        {
            System.out.println("task1 is completed");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("task 2 completed");
        }
        */


        //Grouping exceptions in catch block
        //FOR ANY/FEW/MANY/ALL OF THE EXCEPTIONS GROUPED INSIDE THE CATCH BLOCK
        //THE SAME CATCH BLOCK WILL HANDLE THEM
        /*
        catch (NoSuchPaddingException | NoSuchAlgorithmException| InvalidKeyException | BadPaddingException| IllegalBlockSizeException | IOException ex)
        {
            System.err.println(ex);
        }
        */

    }
}


