import java.util.*;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + " , id=" + id + ", Salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalry;

    public FullTimeEmployee(String name, int id, double monthlySalry) {
        super(name, id);
        this.monthlySalry = monthlySalry;
    }

    @Override

    public double calculateSalary() {
        return monthlySalry;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToBeRemoved = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToBeRemoved = employee;
                break;
            }
        }
        if (employeeToBeRemoved != null) {
            employeeList.remove(employeeToBeRemoved);
        }
    }

    public void AllEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("keshav", 1, 70000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Nikhil", 2, 40, 200);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Employee details :");
        payrollSystem.AllEmployees();

        System.out.println("Ater removing  ");
        payrollSystem.removeEmployee(2);

        System.out.println("Remaining Employee details :");
        payrollSystem.AllEmployees();

    }
}