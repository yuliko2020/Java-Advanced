package homeWork08Hotel;

/**
 * JavaAdvanced
 * 26/07/2020
 */
public class Booking {
    Person person;
    Room room;
    Date start;
    Date finish;

    public Booking(Person person, Room room, Date start, Date finish) {
        this.person = person;
        this.room = room;
        this.start = start;
        this.finish = finish;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "person=" + person +
                ", room=" + room +
                ", start=" + start +
                ", finish=" + finish +
                '}';
    }
}
