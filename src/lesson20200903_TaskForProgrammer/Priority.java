package lesson20200903_TaskForProgrammer;

/**
 * JavaAdvanced
 * 07/09/2020
 */
public enum Priority implements Comparable <Priority>{
    HIGH,
    NORMAL,
    LOW;

    public int getPrioritiesInNumbers() {
        if (this.equals(Priority.HIGH)) {
            return 3;
        } else if (this.equals(Priority.NORMAL)) {
            return 2;
        } else {
            return 1;
        }
    }
}
