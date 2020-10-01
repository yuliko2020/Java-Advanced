package lesson20200925TasksGameFindNumber;

/**
 * JavaAdvanced
 * 25/09/2020
 */
public class GuessNumber {
    static int secretNumber = 2;
    static int attempts = 3;


    private NumberInput numberInput;

    public GuessNumber(NumberInput numberInput) {
        // inversion of control
        this.numberInput = numberInput;

    }

    public void game() {
        System.out.println("Try to guess a secret number : ");

        int number = numberInput.getNextNumber();
        System.out.println(" You entered "+ number);

        boolean correctGuess = false;
        while (attempts > 0 && !correctGuess) {
            if (secretNumber == number) {
                correctGuess = true;
            } else {
                System.out.println(" Wrong number,try again");
                number = numberInput.getNextNumber();
                System.out.println(" You entered "+ number);
            }
            attempts--;
        }
        if (correctGuess) {
            System.out.println("Congratulation , you won !");
        } else {
            System.out.println(" You failed ! ");
        }
        //System.out.println(" You entered " + number);
    }

    public static void main(String[] args) {
        /*NumberInput input = new KeyboardInput();
        GuessNumber number = new GuessNumber(input);
        number.game();*/

        NumberInput mockedInput = new InputMock();
        GuessNumber testGame = new GuessNumber(mockedInput);
        testGame.game();


    }

}
