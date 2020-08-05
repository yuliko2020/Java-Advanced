package lesson03_04Employee;


public class Tester extends Employee {
    public Tester(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("tester: I'am testing program");

    }


    @Override
    public String toString() {
        return "Tester " + super.getName() + "(" + super.getSalary() + ")";
    }
}
