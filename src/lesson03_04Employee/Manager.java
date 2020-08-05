package lesson03_04Employee;


public class Manager extends Employee {
    private double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary);
        this.managerBonus = managerBonus;
    }


    @Override
    public void pay() {
        System.out.println("pay for manager " + getSalary() +
                " bonus " + managerBonus
                + " euro for " + getName());
    }
}
