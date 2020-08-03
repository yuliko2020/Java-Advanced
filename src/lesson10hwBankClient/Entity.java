package lesson10hwBankClient;

/**
 * JavaAdvanced
 * 30/07/2020
 */
public class Entity extends Account {
    private String companyName;
    private String typeOfLegalEntity;

    public Entity(String accountOwner, String iban) {
        super(accountOwner, iban);
    }




    public String getCompanyName() {
        return companyName;
    }

    public String getTypeOfLegalEntity() {
        return typeOfLegalEntity;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "companyName='" + companyName + '\'' +
                ", typeOfLegalEntity='" + typeOfLegalEntity + '\'' +
                '}';
    }
}
