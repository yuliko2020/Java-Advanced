package lesson14Book;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 06/08/2020
 */
public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("Agata", "Berlin", 1951),
                new Book("Roberts", "Odessa", 1951),
                new Book("Ostin", "Munich", 1951),
                new Book("Braun", "Berlin", 1951),


        };

        Arrays.sort(books);
        System.out.println(Arrays.toString(books));
    }
}