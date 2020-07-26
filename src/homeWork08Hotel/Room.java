package homeWork08Hotel;

/**
 * JavaAdvanced
 * 26/07/2020
 */
public class Room {
    int roomNumber;
    int roomFloor;
    String roomType;
    double price;

    public Room(int roomNumber, int roomFloor, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomFloor = roomFloor;
        this.roomType = roomType;
        this.price = price;
    }

   @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomFloor=" + roomFloor +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                '}';
    }
}
