package impl;

import model.Admin;
import model.Customer;
import model.Hotel;
import model.Room;
import reponse.GeneralResponse;

import java.util.ArrayList;
import java.util.LinkedList;

public interface AdminService {
    GeneralResponse<ArrayList<Room>> registerRoom();
    GeneralResponse<ArrayList<Room>> showCustomerInfo();
    GeneralResponse<ArrayList<Room>> roomInfo();
    GeneralResponse<ArrayList<Customer>> showReservation();
    GeneralResponse<ArrayList<Hotel>> hotelInfo();
    GeneralResponse<ArrayList<Customer>> searchCustomer();
    Admin login();


}
