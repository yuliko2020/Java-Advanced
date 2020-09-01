package lesson3108;

/**
 * JavaAdvanced
 * 31/08/2020
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
        return "Address : "+ address + " ("+  type +" )";
    }
}
