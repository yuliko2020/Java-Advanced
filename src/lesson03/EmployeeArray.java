package lesson03;


import java.util.Objects;

public class EmployeeArray {
    private Employee[] employees;

    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }

    public static void PayAll(Employee[] employees) {
        for (Employee employee : employees) {
            employee.pay();
        }
        System.out.println("-------------------------------------");
    }

    public static void WorkAll(Employee[] employees) {
        for (Employee employee : employees) {
            employee.work();
        }
        System.out.println("---------------------------------------");
    }

    public static void PrintAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println("---------------------------------------");

    }

    public static void CodeReviewAll(Employee[] employees) {
        for (Programmer programmer : Objects.requireNonNull(DBMock.getProgrammers())) {
            programmer.codeReview();
            System.out.println("Name " + programmer.getName());
        }
        System.out.println("---------------------------------------");

    }
}
