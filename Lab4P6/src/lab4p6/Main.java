package lab4p6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string: ");
        String inp = input.nextLine();
        System.out.print("Input the substring: ");
        String substr = input.nextLine();

        if(inp.contains(substr))
        {
            System.out.println("Result: The substring exists in the string.");
            //find the number of occurences
            Matcher matcher = Pattern.compile(substr).matcher(inp);
            int count = 0;
            while(matcher.find())
            {
                count++;
            }
            System.out.println(substr + " has been found " + count + " times.");
        }
        else
        {
            System.out.println("Result: The substring does not exist in the string.");
            System.out.println(substr + " has not been found yet.");
        }
    }
}
