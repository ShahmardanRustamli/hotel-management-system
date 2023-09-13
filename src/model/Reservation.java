package model;

import java.time.LocalDate;

public class Reservation {
    private long id;
    private String customerEmail;
    private String roomNumber;
    private int roomPrice;
    private LocalDate reservationDate;
    private LocalDate endReservationDate;

    public Reservation(long id, String customerEmail, String roomNumber, int roomPrice, LocalDate reservationDate, LocalDate endReservationDate) {
        this.id = id;
        this.customerEmail = customerEmail;
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.reservationDate = reservationDate;
        this.endReservationDate = endReservationDate;
    }

    public long getId() {
        return id;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public LocalDate getEndReservationDate() {
        return endReservationDate;
    }
}
