package lesson03;


public class JavaProgrammer extends Programmer {
    public JavaProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void codeReview() {
        System.out.println("This Java code is good");
    }
}
