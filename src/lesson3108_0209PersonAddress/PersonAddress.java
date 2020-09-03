package lesson3108_0209PersonAddress;

/**
 * JavaAdvanced
 * 31/08/2020
 */
public class PersonAddress {
    private String address;
    private AddressType type;

    public PersonAddress(String address, String type) {
        this.address = address;
        try {
            this.type = AddressType.valueOf(type);
        } catch (Exception ex) {
            System.out.println("STOP! The type is not correct");
            throw ex;
        }
    }

    public PersonAddress(String address, AddressType type) {
        this.address = address;
        this.type = type;
    }
    public void send(){
        type.send();
    }


    public String getAddress() {
        return address;
    }

    public  AddressType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Address : "+ address + " ("+  type +" )";
    }
}
