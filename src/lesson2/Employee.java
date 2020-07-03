package lesson2;

/**
 * TelRanJavaBasicModulOne
 * 30/06/2020  19:46
 */
public class Employee {
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee " + name + "(" + salary + ")";
    }

    public void pay() {
        System.out.println("pay " + salary + " euro for " + name);
    }

    public void pay(int bonus) {
        System.out.println("pay " + (salary + bonus) + " euro for " + name);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
    }

}

