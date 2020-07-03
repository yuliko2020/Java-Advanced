package lesson2;

/**
 * TelRanJavaBasicModulOne
 * 30/06/2020  19:37
 */

public class Tester extends Employee {
    public Tester(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("tester: I'am testing program ");
    }

     @Override
    public String toString() {
        return "Tester " + super.getName() + "(" + super.getSalary() + ")";
    }

}

