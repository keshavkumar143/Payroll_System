Author :
keshav Kumar
# Payroll Management System

The Payroll Management System is a Java-based project designed to assist companies in managing bonuses, deductions, salaries, and financial transactions related to employee payroll. This system includes classes for different types of employees, allowing for flexibility in handling full-time and part-time staff.

## Project Overview

### Employee Classes

The project defines a hierarchy of classes to represent different types of employees:

- **`Employee` (Abstract Class):**
  - Represents the base class for all employees.
  - Contains common attributes such as name and ID.
  - Defines an abstract method `calculateSalary()` to be implemented by subclasses.

- **`FullTimeEmployee` (Subclass of `Employee`):**
  - Represents a full-time employee with a fixed monthly salary.
  - Implements the `calculateSalary()` method based on the monthly salary.

- **`PartTimeEmployee` (Subclass of `Employee`):**
  - Represents a part-time employee with variable hours worked and an hourly rate.
  - Implements the `calculateSalary()` method based on hours worked multiplied by the hourly rate.

### PayrollSystem Class

- **`PayrollSystem`:**
  - Manages a list of employees using an `ArrayList`.
  - Provides methods to add (`addEmployee`), remove (`removeEmployee`), and display (`AllEmployees`) employee details.

## Usage

### Adding Employees

To add an employee, create an instance of the appropriate class (either `FullTimeEmployee` or `PartTimeEmployee`) and use the `addEmployee` method of the `PayrollSystem` class.

```java
PayrollSystem payrollSystem = new PayrollSystem();
FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 1, 50000);
PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 2, 20, 15);

payrollSystem.addEmployee(emp1);
payrollSystem.addEmployee(emp2);

Removing Employees

To remove an employee, use the removeEmployee method of the PayrollSystem class, specifying the employee's ID.
payrollSystem.removeEmployee(2);

Displaying Employee Details
To display details of all employees, use the AllEmployees method of the PayrollSystem class.

payrollSystem.AllEmployees();



## Object-Oriented Programming (OOP) Concepts

The Payroll Management System code is designed following key Object-Oriented Programming (OOP) concepts:

### 1. Abstraction

The `Employee` class is declared as an abstract class, providing a common interface for all employee types. It includes an abstract method `calculateSalary()`, which must be implemented by its subclasses (`FullTimeEmployee` and `PartTimeEmployee`). This abstraction allows for a unified representation of employees while accommodating specific implementations for salary calculation.

### 2. Inheritance

The `FullTimeEmployee` and `PartTimeEmployee` classes extend the abstract class `Employee`. Inheritance is used to establish an "is-a" relationship, indicating that `FullTimeEmployee` and `PartTimeEmployee` are specialized types of `Employee` with additional attributes and behaviors inherited from the base class.

### 3. Polymorphism

Polymorphism is demonstrated through the `calculateSalary` method declared in the `Employee` class and implemented differently in its subclasses (`FullTimeEmployee` and `PartTimeEmployee`). The `toString` method is overridden in each subclass to provide specific string representations based on the employee type.

### 4. Encapsulation

The attributes (`name` and `id`) of the `Employee` class are declared as private, encapsulating the internal state of the class. Access to these attributes is controlled through getter methods (`getName` and `getId`). Encapsulation ensures data hiding and restricts direct access to internal details, promoting a more robust and maintainable design.

### 5. Composition

The `PayrollSystem` class contains an `ArrayList` of `Employee` objects, representing a composition relationship. Composition is employed to create a "has-a" relationship, indicating that a `PayrollSystem` has a collection of `Employee` objects.

