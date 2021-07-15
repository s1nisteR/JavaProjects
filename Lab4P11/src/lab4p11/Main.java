package lab4p11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions): ");
        String password = input.next();
        boolean invalidChars = false;
        int digits = 0;
        if(password.length() < 8)
        {
            System.out.println("Invalid Password: " + password);
            System.out.println("A password must have at least eight characters.");
        }
        else
        {
            for(char x : password.toCharArray())
            {
                if(x < '0' || (x > '9' && x < 'A') || (x > 'Z' && x < 'a') || x > 'z')
                {
                    invalidChars = true;
                    break;
                }
            }
            if(invalidChars)
            {
                System.out.println("Invalid Password: " + password);
                System.out.println("A password consists of only letters and digits.");
            }
            else
            {
                for(char x : password.toCharArray())
                {
                    if(x >= '0' && x <= '9')
                    {
                        digits++;
                    }
                }
                if(digits < 2)
                {
                    System.out.println("Invalid Password: " + password);
                    System.out.println("A password must contain at least two digits.");
                }
                else
                {
                    System.out.println("Password is valid: " + password);
                }
            }
        }

    }
}
