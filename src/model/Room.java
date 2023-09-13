package model;

public class Room {
    private long id;
    private int roomNumber;
    private byte roomType;
    private int price;
    private String situationStatus;

    public Room(long id, int roomNumber, byte roomType, int price, String situationStatus) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.situationStatus = situationStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public byte getRoomType() {
        return roomType;
    }

    public void setRoomType(byte roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSituationStatus() {
        return situationStatus;
    }

    public void setSituationStatus(String situationStatus) {
        this.situationStatus = situationStatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", price=" + price +
                ", situationStatus='" + situationStatus + '\'' +
                '}';
    }

}

