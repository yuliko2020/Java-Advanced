package lesson03;


public class DBMock {
    private static Employee[] employees = {
            new CProgrammer("Jack0", 2000.0),
            new JavaProgrammer("Jack6", 4000.0),
            new Tester("Anna", 3000.0),
            new Tester("Alex", 1800.0),
            new CProgrammer("Jack1", 2010.0),
            new CProgrammer("Jack2", 2020.0),
            new JavaProgrammer("Jack3", 2030.0),
            new JavaProgrammer("Jack4", 2040.0),
            new JavaProgrammer("Jack5", 2050.0),
            new Manager("Misha", 2050.0, 3000),
            new Manager("Maria", 2050.0, 4000),
    };

    public static Employee[] getEmployees() {
        return employees;
    }

    public static Programmer[] getProgrammers() {

        int counter = 0;
        for (Employee employee : employees) {
            if (isProgrammer(employee)) {
                counter++;
            }
        }
        if (counter > 0) {
            Programmer[] programmers = new Programmer[counter];
            int i = 0;
            for (Employee employee : employees) {
                if (isProgrammer(employee)) {
                    programmers[i] = (Programmer) employee;
                    i++;
                }
            }
            return programmers;
        }
        return null;
    }


    private static boolean isProgrammer(Employee employee) {
        if (employee instanceof Programmer) {
            return true;
        }
        return false;
    }

}
