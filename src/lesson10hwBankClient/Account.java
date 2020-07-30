package lesson10hwBankClient;

/**
 * JavaAdvanced
 * 30/07/2020
 */
public abstract class Account {
    private String accountOwner;
    private String Iban;

    public Account(String accountOwner, String iban) {
        this.accountOwner = accountOwner;
        Iban = iban;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountOwner='" + accountOwner + '\'' +
                ", Iban='" + Iban + '\'' +
                '}';
    }

}
