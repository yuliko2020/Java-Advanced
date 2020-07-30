package lesson10hwBankClient;

/**
 * JavaAdvanced
 * 30/07/2020
 */
public class Individual extends Account {
    private String fName;
    private String sName;

    public Individual(String accountOwner, String iban) {
        super(accountOwner, iban);
    }




    @Override
    public String toString() {
        return "Individual{" +
                "fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }
}
