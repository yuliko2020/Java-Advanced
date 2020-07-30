package lesson10hwBankClient;

/**
 * JavaAdvanced
 * 30/07/2020
 */
public class Main {
    private static int getAccountType;

    public static void main(String[] args) {
        String[] client = {
                ":Till Schweiger Iban:DE15971891",
                "AG:Microsoft Iban:DE15978765",
                "GmbH:Pupkin SoftLab Iban:DE15954356",
                "e.V.:PupkinSoftLab Iban:DE15954356"
        };

        Account[] accaunts = accountType(client, getAccountType);
        System.out.println(client);
        printAccountArray(accaunts);



    }

    private static Account[] accountType(String[] client, int getAccountType) {
        Account[] accounts = null;
        if (client != null) {
            accounts = new Account[client.length];

            for (int i = 0; i < client.length; i++) {
                String[] result = client[i].split(" ");
                switch (getAccountType(result[0])) {
                case 1:
                    accounts[i] = new Entity(result[0], result[1]);
                    break;
                case 2:
                    accounts[i] = new Individual(result[0], result[1]);
                    break;
            }
            }
        }

        return accounts;
    }

    public static int getAccountType(String actType) {
        if (actType.startsWith(":")) return 1;
        else return 0;

    }

    public static void printAccountArray(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }

    }


}



