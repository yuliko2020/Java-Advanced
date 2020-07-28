package lesson09;

/**
 * JavaAdvanced
 * 27/07/2020
 */
public class Master extends Card {

    public Master(Person person, String number) {
        super(person, number);
    }

    @Override
    public String toString() {
        return "Master{" +
                "person=" + getPerson() +
                ", number='" + getNumber() + '\'' +
                '}';
    }

    @Override
    public String doSecureString() {

        return "Master{" +
                "person=" + getPerson() +
                ", number='" + doSecureNumber () + '\'' +
                '}';
    }
    private String doSecureNumber() {
        String star ="";
        for (int i = 0; i < getNumber().length()-4; i++) {
            star+="*";
        }


        return getNumber().substring(0,2)+star+getNumber().substring(getNumber().length()-2);

    }
}
