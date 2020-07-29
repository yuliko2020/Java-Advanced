package lesson10;

/**
 * JavaAdvanced
 * 28/07/2020
 */
public class Person {
    private String firstName;
    private String secondName;
    private String fatherName;

    public Person(String firstName, String secondName, String fatherName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
    }

    public Person(String firstName, String secondName) {
        this(firstName, secondName, "");
        this.secondName = secondName;
        this.fatherName = "";
    }

    public Person(String firstName) {
        this(firstName, "", "");

    }

    @Override
    public String toString() {
        return "Person{" +
                "surName='" + firstName + '\'' +
                ", firstName='" + secondName + '\'' +
                ", secondName='" + fatherName + '\'' +
                '}';
    }


    public String toShortString() {
        return firstName + ((secondName.length() > 0) ? " " + secondName.substring(0, 1) + "." : secondName) +
                ((fatherName.length() > 0) ? " " + fatherName.substring(0, 1) + "." : fatherName);

    }
}