package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {
    private long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String password;
    private String moneyAccount;
    private LocalDateTime registerDate;
    private LocalDateTime updateDate;
    private LocalDateTime reservationDate;
    private LocalDateTime endReservationDate;
    private int roomId;
    private Reservation reservation;

    public Customer(long id, String name, String surname, String phoneNumber, String email, String password, String moneyAccount, LocalDateTime registerDate, LocalDateTime updateDate, LocalDateTime reservationDate, LocalDateTime endReservationDate, int roomId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.moneyAccount = moneyAccount;
        this.registerDate = LocalDateTime.now();
        this.updateDate = updateDate;
        this.reservationDate = reservationDate;
        this.endReservationDate = endReservationDate;
        this.roomId = roomId;
    }

    public Customer(Customer customer) {
    }

    public Reservation getReservation(){
        return reservation;
    }
    public void setReservation(){
        this.reservation = reservation;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(String moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDateTime getEndReservationDate() {
        return endReservationDate;
    }

    public void setEndReservationDate(LocalDateTime endReservationDate) {
        this.endReservationDate = endReservationDate;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

}
