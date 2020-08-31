package lesson262708Hw;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 31/08/2020
 */
public class Address {
    private String deliveryAddress;
    private String emailAddress;
    private List<Address> addresses = new ArrayList<>();

    public Address(String deliveryAddress, String emailAddress) {
        this.deliveryAddress = deliveryAddress;
        this.emailAddress = emailAddress;
    }


    public Address(String emailAddress) {
        if (emailAddress != null)
            this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "deliveryAddress='" + deliveryAddress + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
