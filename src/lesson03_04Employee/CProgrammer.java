package lesson03_04Employee;

public class CProgrammer extends Programmer {
    public CProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void codeReview() {
        System.out.println("This C code is good");
    }

    //Object-> Employee -> Programmer -> CProgrammer


}
