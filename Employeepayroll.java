import java.util.*;

class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;

    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}

class Payroll {

    private List<Employee> employees;

    public Payroll() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showEmployees() {
        for(Employee e : employees) {
            e.displayDetails();
            System.out.println();
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for(Employee e : employees) {
            totalSalary += e.getSalary();
        }
        return totalSalary;
    }
}

public class Employeepayroll {
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        payroll.addEmployee(new Employee(101, "John", "Manager", 60000));
        payroll.addEmployee(new Employee(102, "Sarah", "Developer", 80000));

        Scanner sc = new Scanner(System.in);

        while(true) {
            // Display user choices
            System.out.println("1. Show employees");
            System.out.println("2. Calculate total salary");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    payroll.showEmployees();
                    break;

                case 2:
                    double totalSalary = payroll.calculateTotalSalary();
                    System.out.println("Total Salary: " + totalSalary);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}