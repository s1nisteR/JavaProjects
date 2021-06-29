package lab1p2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter Marks: ");

	    int marks = input.nextInt();

	    if(marks < 25)
		{
			System.out.println("F");
		}
	    else if(marks <= 45)
		{
			System.out.println("E");
		}
	    else if(marks <= 50)
		{
			System.out.println("D");
		}
	    else if(marks <= 60)
		{
			System.out.println("C");
		}
	    else if(marks <= 80)
		{
			System.out.println("B");
		}
	    else
		{
			System.out.println("A");
		}
    }
}
