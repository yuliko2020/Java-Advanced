package hw_02_Employee;

/**
 * TelRanJavaBasicModulOne
 * 02/07/2020  11:22
 */
public class JavaProgrammer extends Employee {
    public JavaProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am Java programmer. I write Java Program ");
    }

    public void codeReview() {
        System.out.println("This Java code is good.");
    }

}
