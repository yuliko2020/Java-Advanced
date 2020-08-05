package lesson03_04;


import java.util.Objects;

public class EmployeeArray {
    private Employee[] employees;

    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }

    public  void PayAll() {
        for (Employee employee : employees) {
            employee.pay();
        }
        System.out.println("-------------------------------------");
    }

    public  void WorkAll() {
        for (Employee employee : employees) {
            employee.work();
        }
        System.out.println("---------------------------------------");
    }

    public  void PrintAll() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println("---------------------------------------");

    }

    public  void CodeReviewAll() {
        for (Programmer programmer : Objects.requireNonNull(DBMock.getProgrammers())) {
            programmer.codeReview();
            System.out.println("Name " + programmer.getName());
        }
        System.out.println("---------------------------------------");

    }
}
