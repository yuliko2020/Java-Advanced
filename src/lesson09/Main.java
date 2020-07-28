package lesson09;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 27/07/2020
 */
public class Main {
    public static void main(String[] args) {
        String[] bankData = new String[]{
                "12647375265413 Mark"
                , "13548365423654 Lena"
                , "13558365423654 Bob"
        };

        //System.out.println(Arrays.toString(cardClient(bankData)));
        Card[] cards = cardClient(bankData);
        printCardArray(cards);
        System.out.println(Arrays.toString(cards));
    }

    public static Card[] cardClient(String[] array) {
        Card[] cards = new Card[array.length];
        for (int i = 0; i < array.length; i++) {
            String[] result = array[i].split(" ");
            switch (getCardType(result[0])) {
                case 1:
                    cards[i] = new Master(new Person(result[1]), result[0]);
                    break;
                case 2:
                    cards[i] = new Visa(new Person(result[1]), result[0]);
                    break;
                default:
                    System.out.println("Eror");
            }
            // cards[i] = new Card(new Person(result[1]), result[0]);
        }
        return cards;
    }


    public static int getCardType(String number) {
        if (number.startsWith("12")) return 1;
        if (number.startsWith("13")) return 2;

        return 0;
    }

    public static void printCardArray(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card.doSecureString());
        }

    }


}


