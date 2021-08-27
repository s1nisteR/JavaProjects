package carcompany;

class Vehicle
{
    protected String registrationID;
    protected String color;

    Vehicle()
    {
        this.registrationID = "";
        this.color = "";
    }

    Vehicle(String registrationID, String color)
    {
        this.registrationID = registrationID;
        this.color = color;
    }

    //Getters And Setters
    public String getRegistrationID() { return this.registrationID; }
    public String getColor() { return  this.color; }

    public void setRegistrationID(String registrationID)
    {
        this.registrationID = registrationID;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    //methods
    public void DisplayData()
    {
        System.out.println("Registration ID: " + this.registrationID);
        System.out.println("Color: " + this.color);
    }

}

class Car extends Vehicle
{
    private String Company;
    private String CarType;

    Car()
    {
        super();
        this.Company = "";
        this.CarType = "";
    }

    Car(String registrationID, String color, String Company, String CarType)
    {
        super(registrationID, color);
        this.Company = Company;
        this.CarType = CarType;
    }

    //Getters And Setters
    public String getCompany() {
        return this.Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    public String getCarType() {
        return this.CarType;
    }

    public void setCarType(String carType) {
        this.CarType = carType;
    }

    //methods
    @Override
    public void DisplayData()
    {
        super.DisplayData();
        System.out.println("Company: " + this.Company);
        System.out.println("Car Type: " + this.CarType);
    }
}

class Truck extends Vehicle
{
    private int NumberOfWheels;
    private String Company;

    Truck()
    {
        super();
        this.NumberOfWheels = 0;
        this.Company = "";
    }

    Truck(String registrationID, String color, int NumberOfWheels, String Company)
    {
        super(registrationID, color);
        this.NumberOfWheels = NumberOfWheels;
        this.Company = Company;
    }

    //getters and setters
    public int getNumberOfWheels() {
        return this.NumberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.NumberOfWheels = numberOfWheels;
    }

    public String getCompany() {
        return this.Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    //methods
    @Override
    public void DisplayData()
    {
        super.DisplayData();
        System.out.println("Number of Wheels: " + this.NumberOfWheels);
        System.out.println("Company: " + this.Company);
    }
}



public class Main {

    public static void main(String[] args) {
	    Car first = new Car("sfhfk", "Wht", "Noob", "lololol");
	    first.DisplayData();

	    Truck second = new Truck("dkjhdf", "Black", 4, "sjkdhs");
	    second.DisplayData();

	    Vehicle test = new Vehicle("sjkfhf", "Red");
	    test.DisplayData();
	    test = (Vehicle)first;
	    test.DisplayData();

	    //Will throw an error, since can't cast between child classes
	    //first = (Car)second;

        //Will throw a ClassCastException
        /*
        test = (Vehicle)second;
        first = (Car)test;
        first.DisplayData();
        */
    }
}
