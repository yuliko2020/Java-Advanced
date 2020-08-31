package lesson262708Hw;

/**
 * JavaAdvanced
 * 31/08/2020
 */
public class Person {
    private String fName;
    private String sName;
    private Address address;

    public Person(String fName, String sName, Address address) {
        this.fName = fName;
        this.sName = sName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                ", address=" + address +
                '}';
    }
}
