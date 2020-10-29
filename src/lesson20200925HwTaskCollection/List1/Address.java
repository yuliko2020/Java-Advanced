package lesson20200925HwTaskCollection.List1;

public class Address {
    private String street;
    private int house;

    public Address(String street, int house) {
        this.street = street;
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (house != address.house) return false;
        return street != null ? street.equals(address.street) : address.street == null;
    }

    @Override
    public int hashCode() {
        int result = street != null ? street.hashCode() : 0;
        result = 31 * result + house;
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street ='" + street + '\'' +
                ", house =" + house +
                '}';
    }
}
