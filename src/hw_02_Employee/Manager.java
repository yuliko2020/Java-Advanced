package hw_02_Employee;

/**
 * TelRanJavaBasicModulOne
 * 02/07/2020  13:21
 */
public class Manager extends Employee {
    private double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary, managerBonus);
        this.managerBonus = managerBonus;

    }

    @Override
    public void pay() {
        System.out.println("Manager " + getName() + "get salary + "
                + getSalary() + " and bonus " + getManagerBonus(managerBonus)
                + " Euro");
    }
}
