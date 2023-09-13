package data;

import model.Admin;
import model.Customer;
import model.Hotel;
import model.Room;

import java.util.ArrayList;
import java.util.LinkedList;

public class GlobalData{
    public static ArrayList<Customer> customerList  = new ArrayList<>();

    public static Admin[] admin;


    static {
        admin = new Admin[]{
                new Admin("admin","admin"),
        };
    }
    public static LinkedList<Room> rooms;

    static {
        rooms = new LinkedList<>();
            rooms.add(new Room(1L,1, (byte) 1,50,"Available"));
        rooms.add(new Room(2L,2, (byte) 1,75,"Available"));
        rooms.add(new Room(3L,3, (byte) 2,100,"Available"));
        rooms.add(new Room(4L,4, (byte) 3,150,"Available"));
        rooms.add(new Room(5L,5, (byte) 4,200,"Available"));

        }

        public static LinkedList<Hotel> hotels;

    static {
        hotels = new LinkedList<>();
        hotels.add(new Hotel(1,"Grand Hotel Baku","Azadlig ave, street 13","4169731351620516"));
    }
}
