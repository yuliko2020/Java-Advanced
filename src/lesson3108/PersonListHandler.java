package lesson3108;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * JavaAdvanced
 * 31/08/2020
 */
public class PersonListHandler {
    public static List<String> personListHandler(List<Person> people) {

        List<String> list = new ArrayList<>();
        if ((people != null)) {
            for (Person person:people){
                List <PersonAddress> tempAddressList =person.getAddresses("email");
                String nameString = person.getFirstName()+' '+ person.getSecondName();
                for (PersonAddress adr :tempAddressList){
                    list.add(new String(adr.getAddress()+' '+ nameString));
                }

            }
        }

        return list;
    }
}
