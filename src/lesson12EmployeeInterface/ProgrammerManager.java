package lesson12EmployeeInterface;

/**
 * JavaAdvanced
 * 04/08/2020
 */
public class ProgrammerManager extends Programmer implements ManagerAble {

    public ProgrammerManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void codeReview() {

    }


    @Override
    public void manage() {

    }
}
