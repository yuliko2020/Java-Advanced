package lesson12EmployeeInterface;


public abstract class  Programmer extends Employee { // extends - наследование
    public Programmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("programmer: I'am writing code");
    }


    abstract public void codeReview();
}
