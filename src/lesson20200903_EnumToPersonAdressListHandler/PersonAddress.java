package lesson20200903_EnumToPersonAdressListHandler;

/**
 * JavaAdvanced
 * 07/09/2020
 */
public class PersonAddress {
    private String address;
    private AddressType type;

    public PersonAddress(String address, String type) {
        this.address = address;
        this.type = AddressType.valueOf(type.toUpperCase());
    }
    public PersonAddress(String address, AddressType type) {
        this.address = address;
        this.type = type;
    }
    public String getAddress() {
        return address;
    }

    public String getType() {
        return type.name().toLowerCase();
    }
    public AddressType getTypeAsEnum() {
        return type;
    }

    @Override
    public String toString() {
        return "Address:"+ address + '(' + type +')';
    }
}
