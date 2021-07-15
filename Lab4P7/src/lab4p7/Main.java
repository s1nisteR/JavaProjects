package lab4p7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string: ");
        String inp = input.nextLine();

        String word = "";
        String small = "";
        String large = "";
        String[] words = new String[inp.length()];
        int length = 0;

        inp = inp + " ";

        for(int i = 0; i < inp.length(); i++)
        {
            if(inp.charAt(i) != ' ')
            {
                word += inp.charAt(i);
            }
            else
            {
                words[length] = word.toString();
                length++;
                word = "";
            }
        }
        small = large = words[0];

        for(int j = 0; j < length; j++)
        {
            if (small.length() > words[j].length())
            {
                small = words[j];
            }
            else if (large.length() < words[j].length())
            {
                large = words[j];
            }
        }

        System.out.println("The largest word is '" + large + "'");
        System.out.println("and the smallest word is '" + small + "'");
        System.out.println("in the string : '" + inp.trim() + "'.");
    }
}
