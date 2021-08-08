//Solutions to questions from i) to v)
//Solution to question vi) has been given in the second part(lab7questions2)

package lab7questions;

class First
{
    First()
    {

    }
    //if this was set to private then the third step would receive an error (VERIFIED)
    public void print()
    {
        System.out.println("This is the parent class");
    }
}

class Second extends First
{
    Second()
    {

    }

    public void print()
    {
        super.print();
    }

    public void printChild()
    {
        System.out.println("This is the child class");
    }
}

class Member
{
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    Member(String name, int age, String phoneNumber, String address, double salary)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary()
    {
        System.out.println(this.salary);
    }
}

class Employee extends Member
{
    private String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization)
    {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

class Manager extends Member
{
    private String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department)
    {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Rectangle
{
    private double length;
    private double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    //methods
    public void printArea()
    {
        System.out.println(this.length * this.breadth);
    }
    public void printPerimeter()
    {
        System.out.println(this.length + this.length + this.breadth + this.breadth);
    }
}

class Square extends Rectangle
{
    Square(double s)
    {
        super(s, s);
    }
}

public class Main {

    public static void main(String[] args) {

        //Question 1 and 2 testing
        First father = new First();
	    Second son = new Second();
	    father.print();
	    son.printChild();
	    son.print();

	    //Question 3 testing
        Employee first = new Employee("Matthews", 69, "01301959364", "16/A Tejkunipara", 69000, "Artificial Intelligence");
        Manager second = new Manager("Ankon", 80, "01715954794", "402 Monipuripara", 100000, "R&D");
        first.printSalary();
        second.printSalary();

        //Question 4 testing
        Rectangle rect1 = new Rectangle(3, 4);
        Square squ1 = new Square(4);
        rect1.printArea();
        rect1.printPerimeter();
        squ1.printArea();
        squ1.printPerimeter();


        //Question 5 Testing
        Square[] arr = new Square[10];

        for(int i = 1; i <= 10; ++i)
        {
            arr[i - 1] = new Square(i);
        }
        System.out.println("Areas of 10 squares");
        for(int i = 0; i < 10; ++i)
        {
            arr[i].printArea();
        }

    }
}
