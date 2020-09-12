package lesson20200909CBankClient;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * JavaAdvanced
 * 09/09/2020
 */
public class Parser {
    public static Account[] parseStringArrayToAccounts(String[] array, Function<String, Account> function) {
        Account[] temp = null; // логичней использовать лист
        Account[] result = null;
        if (array != null && function != null) {
            temp = new Account[array.length];
            int index = 0;
            for (String string : array) {
                Account account = function.apply(string);
                if (account != null) {
                    temp[index++] = account;
                }
            }
            result = new Account[index ];
            System.arraycopy(temp, 0, result, 0, index );
        }

        return result;
    }


    public static Account[] parseStringList(String[] array, Function<String, Account> function) {
        List<Account> temp =new ArrayList<>();
        Account[] res=null;
        if (array != null && function != null) {
            for (String string : array) {
                Account account = function.apply(string);
                if (account != null) {
                    temp.add(account);
                }
            }
            res =new Account[temp.size()];
            temp.toArray(res);
        }

        return res;
    }


}
