package lesson09;

/**
 * JavaAdvanced
 * 27/07/2020
 */
public class Visa extends Card {
    public Visa(Person person, String number) {
        super(person, number);
    }

    @Override
    public String toString() {
        return "Visa{" +
                "person=" + getPerson() +
                ", number='" + getNumber() + '\'' +
                '}';
    }
    @Override
    public String doSecureString() {

        return "Visa{" +
                "person=" + getPerson() +
                ", number='" + doSecureNumber () + '\'' +
                '}';
    }

    private String doSecureNumber() {
        String star ="";
        for (int i = 0; i < getNumber().length()-6; i++) {
            star+="*";
        }


        return getNumber().substring(0,4)+star+getNumber().substring(getNumber().length()-2);

    }
}