package hotel;

/**
 * JavaAdvanced
 * 31/07/2020
 */
public class Booking {
    static private int nextId = 0;
    private int id;
    private Room room;
    private Person person;
    private DateInterval dateInterval;

    public Booking(Room room, Person person, DateInterval dateInterval) {
        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;
        this.id = ++nextId;

    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

    public DateInterval getDateInterval() {
        return dateInterval;
    }

    public double getPrice() {
        return this.room.getPrice() * this.dateInterval.getDays();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booking booking = (Booking) o;

        if (id != booking.id) return false;
        if (room != null ? !room.equals(booking.room) : booking.room != null) return false;
        if (person != null ? !person.equals(booking.person) : booking.person != null) return false;
        return dateInterval != null ? dateInterval.equals(booking.dateInterval) : booking.dateInterval == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (dateInterval != null ? dateInterval.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "(" + id + ")" + "Booking: " + room +
                " person=" + person +
                " " + dateInterval + " \n\tprice for " + this.dateInterval.getDays() + " days is " + getPrice() + " Euro";
    }

}
