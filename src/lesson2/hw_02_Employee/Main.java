package lesson2.hw_02_Employee;

/**
 * TelRanJavaBasicModulOne
 * 02/07/2020  11:40
 */
public class Main {
    public static void main(String[] args) {
        JavaProgrammer JavaProg1 = new JavaProgrammer("Nick", 3300.0);
        JavaScriptProgrammer JsProg1 = new JavaScriptProgrammer("Anton", 2950.0);
        CProgrammer CProg1 = new CProgrammer("Svetlana", 3100.0);
        Manager manager1 = new Manager("Leonardo", 3500.0, 500.0);
        Manager manager2 = new Manager("Leon", 3700.0, 500.0);

        Employee[] employees = new Employee[]{
                JavaProg1,
                JsProg1,
                CProg1,
                manager1,

                manager2};

        System.out.println("----------------------");
        for (Employee employee : employees) {
            employee.work();
            employee.pay();
        }

        System.out.println("----------------------");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println("----------------------");
        for (Employee employee : employees) {
            employee.work();
            employee.codeReview();
        }
    }

}
