package hw_02_Employee;

/**
 * TelRanJavaBasicModulOne
 * 02/07/2020  11:34
 */
public class Employee {
    private String name;
    private double salary;
    private double managerBonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double salary, double managerBonus) {
        this.name = name;
        this.salary = salary;
        this.managerBonus = managerBonus;
    }

    @Override
    public String toString() {
        return "Employee " + name + "(" + salary + ")";
    }

    public void work() {
        System.out.println();
    }

    public void pay() {
        System.out.println("Programmer "+ name + " to pay: " + salary + " Euro");
    }


    public String getName() {
        return name;
    }

    public double getManagerBonus(double managerBonus) {
        return managerBonus;
    }

    public double getSalary() {
        return salary;
    }

    public void codeReview() {

    }
}
