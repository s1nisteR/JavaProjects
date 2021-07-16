package lab5p1;


import java.util.Scanner;

class Icecream implements Comparable<Icecream>
{
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;

    //Constructors
    Icecream()
    {
        this.icecreamCompany = "";
        this.icecreamPrice = 0.0;
        this.icecreamType = "";
    }
    Icecream(String icecreamType, String icecreamCompany, double icecreamPrice)
    {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }

    //getters and setters
    public String getIcecreamType() {
        return icecreamType;
    }

    public void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }

    public void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }

    //methods
    public String toString()
    {
        return "Type: " + this.icecreamType + "\nCompany: " + this.icecreamCompany + "\nPrice: " + this.icecreamPrice;
    }

    public boolean equals(Icecream I)
    {
        return this.icecreamPrice == I.getIcecreamPrice();
    }

    @Override
    public int compareTo(Icecream I)
    {
        return Double.compare(this.icecreamPrice, I.getIcecreamPrice());
    }

    public static void searchByCompany(String company, Icecream[] arr)
    {
        for(Icecream I : arr)
        {
            if(I.getIcecreamCompany().equals(company))
            {
                System.out.println(I);
            }
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	    Icecream first = new Icecream();
	    Icecream second = new Icecream("Dark Chocolate", "Polar", 60.0);
        System.out.println(first);
        System.out.println();
        System.out.println(second);


        String type;
        String company;
        double price;
        Icecream[] arr = new Icecream[10];
        for(int i = 0; i < 10; ++i)
        {
            System.out.print("Enter Type: ");
            type = input.nextLine();
            System.out.print("Enter Company: ");
            company = input.nextLine();
            System.out.print("Enter Price: ");
            price = input.nextDouble();
            input.nextLine();

            arr[i] = new Icecream(type, company, price);
        }

        Icecream.searchByCompany("Polar", arr);
    }
}
