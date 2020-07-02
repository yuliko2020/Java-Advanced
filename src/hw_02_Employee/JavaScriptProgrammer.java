package hw_02_Employee;

/**
 * TelRanJavaBasicModulOne
 * 02/07/2020  11:24
 */
public class JavaScriptProgrammer extends Employee {
    public JavaScriptProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am JavaScript programmer. I write Java Program ");
    }

    public void codeReview() {
        System.out.println("This JavaScript code is good.");
    }

}
