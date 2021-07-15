package lab4p17;

class Complex
{
    private double realPart;
    private double imaginaryPart;

    //Default constructor
    public Complex()
    {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    //Parameterized Constructor
    public Complex (double realPart, double imaginaryPart)
    {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    //getters
    public double getRealPart() { return this.realPart; }
    public double getImaginaryPart() { return this.imaginaryPart; }

    //setters
    public void setRealPart(double realPart) { this.realPart = realPart; }
    public void setImaginaryPart(double imaginaryPart) { this.imaginaryPart = imaginaryPart; }

    //methods
    public Complex add(Complex otherNumber)
    {
        return new Complex(this.realPart + otherNumber.realPart, this.imaginaryPart + otherNumber.imaginaryPart);
    }
    public Complex subtract(Complex otherNumber)
    {
        return new Complex(this.realPart - otherNumber.realPart, this.imaginaryPart - otherNumber.imaginaryPart);
    }
    public Complex multiply(Complex otherNumber)
    {
        return new Complex((this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart), (this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart));
    }
    public Complex divide(Complex otherNumber)
    {
        double temp = Math.pow(otherNumber.realPart, 2) + Math.pow(otherNumber.imaginaryPart, 2);
        return new Complex(((this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart) / temp), ((this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart) / temp));
    }
    public String toString()
    {
        if(this.imaginaryPart >= 0.0)
        {
            return (this.realPart + "+" + this.imaginaryPart + "i");
        }
        else
        {
            return (this.realPart + "" + this.imaginaryPart + "i");
        }
    }
}


public class Main {

    public static void main(String[] args) {
	    Complex first = new Complex(-2.0, -3.0);
	    Complex second = new Complex(-3.0, -2.0);
	    Complex answer = first.add(second);
        System.out.println(answer);

        answer = first.subtract(second);
        System.out.println(answer);

        answer = first.divide(second);
        System.out.println(answer);

        second.setImaginaryPart(3.0);
        second.setRealPart(5.0);

        answer = first.multiply(second);
        System.out.println("Real: " + answer.getRealPart() + "\n" + "Imaginary: " + answer.getImaginaryPart());

    }
}
