package lesson20200925Tasks;

import java.util.Scanner;

/**
 * JavaAdvanced
 * 25/09/2020
 */
public class KeyboardInput implements NumberInput{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public int getNextNumber() {
        return scanner.nextInt();
    }
}
