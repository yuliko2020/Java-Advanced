package lesson20200909CBankClient;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 09/09/2020
 */
public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{
                ":Til Schweiger Iban:DE15971891",
                " AG:Macrosoft Iban:DE15978765",
                " GmbH:Pupkin SoftLab Iban:DE15954356",
                " e.V.:PupkinSoftLab Iban:DE15954356",

        };
        Account[] account = Parser.parseStringArrayToAccounts(strings, new ParserString());
        System.out.println(Arrays.toString(account));
        System.out.println("----------------");
        Account[]account2 =Parser.parseStringArrayToAccounts(strings,new ParserString());
        System.out.println(Arrays.toString(account2));
    }
}
