package lesson3108;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * JavaAdvanced
 * 31/08/2020
 */
public class Person {
    private String firstName;
    private String secondName;
    private List<PersonAddress> addresses;

    public Person(String firstName, String secondName, List<PersonAddress> addresses) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.addresses = addresses;
    }

    public Person(String firstName, String secondName) {
            this.firstName = Objects.requireNonNull(firstName);
            this.secondName = secondName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<PersonAddress> getAddresses() {
        return new ArrayList<>(addresses);
    }

    public List<PersonAddress> getAddresses( String type) {
        List <PersonAddress>res=new ArrayList<>();
        for (PersonAddress address :addresses){
            if (address.getType().equals(type)){
                res.add(address);
            }
        }
        return res;
    }

    public void addAddress(PersonAddress address) {
        if (address != null) {
            if (addresses == null) {
                addresses = new ArrayList<>();
            }
            addresses.add(address);
        }
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName  + addresses ;
    }
}
