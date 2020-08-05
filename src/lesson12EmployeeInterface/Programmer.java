package lesson03_04Employee;


public class Programmer extends Employee { // extends - наследование
    public Programmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("programmer: I'am writing code");
    }


    public void codeReview() {

    }
}
