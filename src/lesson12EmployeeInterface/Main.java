package lesson12EmployeeInterface;


public class Main {

    public static void main(String[] args) {
        Manager m1 = new Manager("m1", 1000.0, 100);
        Manager m2 = new Manager("m2", 1001.0, 101);
        ProgrammerManager pm1 = new ProgrammerManager("3", 1001.0);

        ManagerAble[] emp ={m1,m2,pm1};
        emp[0].manage();

        ManagerAble qwe =new Manager("3",1001.0,101);




        EmployeeArray dep01 = new EmployeeArray(DBMock.getEmployees());
        EmployeeArray dep02 = new EmployeeArray(
                new Employee[]{
                        new CProgrammer("Oleg", 3000),
                        new Manager("Sasha", 2000, 100)
                }
        );
        System.out.println("-----------Department 01");
        dep01.PrintAll();
        System.out.println("------------department 02");
        dep02.PrintAll();
        EmployeeArray[] firm = {dep01, dep02};
        for (EmployeeArray arr : firm) {
            arr.WorkAll();
        }


        /*EmployeeArray employees = new EmployeeArray(DBMock.getEmployees());
        employees.PrintAll();
        employees.PayAll();
        employees.WorkAll();
        employees.CodeReviewAll();*/


        /*EmployeeArray.PayAll(DBMock.getEmployees());
        EmployeeArray.WorkAll(DBMock.getEmployees());
        EmployeeArray.PrintAll(DBMock.getEmployees());
        EmployeeArray.CodeReviewAll(DBMock.getProgrammers());
*/

        /*//Object -> Employee -> Programmer
        Employee[] employees = DBMock.getEmployees();
        Programmer[] programmers = DBMock.getProgrammers();
        String[] bonusList = {"Jack", "Anna", "Nick"};

        System.out.println("-------- print all employees ------");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println("-------- pay all employees ------");
        for (Employee employee : employees) {
            payForEmployee(employee);
        }

        System.out.println("-------- work all employees ------");
        for (Employee employee : employees) {
            employee.work();
        }

        System.out.println("-------- codeReview all programmers ------");
        for (Programmer programmer : programmers) {
            System.out.println(programmer.getName());
            System.out.print("   ");
            programmer.codeReview();
        }

    }

    public static boolean isBonus(String[] bonusList, String name) {
        for (String str : bonusList) {
            if (str.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void payForEmployee(Employee employee) {
        employee.pay();
    }*/
    }
}