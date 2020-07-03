package lesson2.hw_02_Employee;

/**
 * TelRanJavaBasicModulOne
 * 02/07/2020  11:22
 */
public class CProgrammer extends Employee {
    public CProgrammer(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void work() {
        System.out.println("I am Java programmer. I write Java Program");
    }

    public void codeReview() {
        System.out.println("This C# code is good.");
    }

}
