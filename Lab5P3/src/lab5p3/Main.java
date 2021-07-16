package lab5p3;

import java.util.Scanner;

class Fraction
{
    private int numerator;
    private int denominator;

    //constructors
    Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    //getters and setters
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    //methods
    public void add(Fraction fraction)
    {
        this.numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        this.denominator = this.denominator * fraction.denominator;
    }

    public void sub(Fraction fraction)
    {
        this.numerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        this.denominator = this.denominator * fraction.denominator;
    }

    public void multiplication(Fraction fraction)
    {
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
    }

    public void division(Fraction fraction)
    {
        this.numerator = this.numerator * fraction.denominator;
        this.denominator = this.denominator * fraction.numerator;
    }


    public String toString()
    {
        return this.numerator + "/" + this.denominator;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numerator: ");
        int num1 = input.nextInt();
        System.out.print("Denominator: ");
        int denom1 = input.nextInt();
        System.out.print("Numerator: ");
        int num2 = input.nextInt();
        System.out.print("Denominator: ");
        int denom2 = input.nextInt();
	    Fraction first = new Fraction(num1, denom1);
	    Fraction second = new Fraction(num2, denom2);
        System.out.println(first);
        System.out.println(second);
	    first.add(second);
        System.out.println(first);
        first.sub(second);
        System.out.println(first);
        first.multiplication(second);
        System.out.println(first);
        first.division(second);
        System.out.println(first);

    }
}
