package lesson3108ListPersonHandler;

/**
 * JavaAdvanced
 * 03/09/2020
 */
public class PersonAddress {
    private String address;
    private String type;

    public PersonAddress(String address, String type) {
        this.address = address;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Address:"+ address + '(' + type +')';
    }
}
