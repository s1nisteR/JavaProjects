package lab6p1;

class Employee {
    private double m_salary;
    private int m_dailyWorkHours;

    //constructors
    Employee() {
        this.m_salary = 0.0;
        this.m_dailyWorkHours = 0;
    }

    Employee(double t_salary, int t_dailyWorkHours) {
        this.m_salary = t_salary;
        this.m_dailyWorkHours = t_dailyWorkHours;
    }

    //getters
    double getSalary() { return this.m_salary; }
    int getDailyWorkHours() { return this.m_dailyWorkHours; }

    //setters
    void setSalary(double t_salary) {
        this.m_salary = t_salary;
    }
    void setDailyWorkHours(int t_dailyWorkHours) {
        this.m_dailyWorkHours = t_dailyWorkHours;
    }

    //methods
    void getInfo() {
        System.out.println("Salary: " + this.m_salary);
        System.out.println("Daily Work Hours: " + this.m_dailyWorkHours);
        System.out.println();
    }

    void addSal() {
        if(this.m_salary < 500.0) {
            this.m_salary += 10.0;
        }
    }

    void addWork() {
        if(this.m_dailyWorkHours > 6) {
            this.m_salary += 5;
        }
    }
}



public class Main {

    public static void main(String[] args) {
        Employee Jack = new Employee(20.0, 60);
        Employee Noob = new Employee(900.0, 2);

        Noob.setSalary(200.0);
        Jack.setSalary(300.65);
        Noob.addSal();

        Jack.addWork();

        Jack.getInfo();
        Noob.getInfo();
    }
}
