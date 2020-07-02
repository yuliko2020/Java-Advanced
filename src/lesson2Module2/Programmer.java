package lesson2Module2;

/**
 * TelRanJavaBasicModulOne
 * 30/06/2020  19:32
 */
public class Programmer extends Employee{
    public Programmer(String name, double salary) {
        super(name,salary);
    }
    @Override
    public void work() {
        System.out.println("programmer: I'am writing code ");
    }

}
