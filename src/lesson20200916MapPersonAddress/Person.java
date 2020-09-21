package lesson20200916MapPersonAddress;
import java.util.List;
import java.util.Objects;
/**
 * JavaAdvanced
 * 16/09/2020
 */
public class Person {
    private String name;
    private List<Address> address;

    public Person(String name, List<Address> address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "\n" + name + ", " + address;
    }
}
