package lesson20200902PersonAddress;

import java.util.ArrayList;
import java.util.List;

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
        this.firstName = firstName;
        this.secondName = secondName;
    }
    /*public Person(String firstName, String secondName) {
           // this.firstName = Objects.requireNonNull(firstName);
            //this.secondName = secondName;

        if (firstName != null) {
            this.firstName = firstName;
            this.secondName = secondName;
        } else {
            throw new IllegalArgumentException(); //если пришел null, объект не создается. Объект сам контролирует свою целостность
        }

    }*/

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<PersonAddress> getAddresses(AddressType addressType) {
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

    public void addAddress(PersonAddress address) {//добавление адресов, если пришел Person без списка адресов
        if (address != null) {//проверка исходного параметра, что он не null
            if (addresses == null) {//проверка, существует ли уже список PersonAddress, куда мы хотим записать адрес
                addresses = new ArrayList<>(); //если нет - создаем его, 16 элементов по умолчанию
            }
            addresses.add(address);
        }
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName  + addresses ;
    }
}
