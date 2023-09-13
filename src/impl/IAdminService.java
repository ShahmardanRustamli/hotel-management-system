package impl;

import data.GlobalData;
import enums.ExceptionEnum;
import enums.StatusEnum;
import model.Admin;
import model.Customer;
import model.Hotel;
import model.Room;
import reponse.GeneralResponse;
import util.InputUtil;

import java.util.ArrayList;
import java.util.LinkedList;

import static data.GlobalData.*;
import static helper.Helper.fillRoom;

public class IAdminService implements AdminService {

    private static Admin login;

    public static Admin getLogin() {
        return login;
    }

    private static void setLogin(Admin login) {
        IAdminService.login = login;
    }


    @Override
    public GeneralResponse<ArrayList<Room>> registerRoom() {
        int roomCount = InputUtil.getInstance().inputInt("Enter The Room Count:");
        LinkedList<Room> tempList = new LinkedList<>();
        for (int i = 0; i < roomCount; i++) {
            Room room = fillRoom();
            if (room != null) {
                rooms.add(room);
                tempList.add(room);
            }
        }
        return new GeneralResponse<ArrayList<Room>>().of(StatusEnum.ROOM_REGISTER_SUCCESSFULLY.getMessage());
    }

    @Override
    public GeneralResponse<ArrayList<Room>> showCustomerInfo() {
        for (Customer customer : GlobalData.customerList) {
            System.out.println(customer);
        }
        return new GeneralResponse<ArrayList<Room>>().of(StatusEnum.SHOW_SUCCESSFULLY.getMessage());
    }

    @Override
    public GeneralResponse<ArrayList<Room>> roomInfo() {
        for (Room room : rooms) {
            System.out.println(room);
        }
        return new GeneralResponse<ArrayList<Room>>().of(StatusEnum.ROOM_INFO.getMessage());

    }

    @Override
    public GeneralResponse<ArrayList<Customer>> showReservation() {
        return null;

    }

    @Override
    public GeneralResponse<ArrayList<Hotel>> hotelInfo() {
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
        return new GeneralResponse<ArrayList<Hotel>>().of(StatusEnum.HOTEL_SHOW.getMessage());
    }

    @Override
    public GeneralResponse<ArrayList<Customer>> searchCustomer() {
        if (GlobalData.customerList == null) {
            return new GeneralResponse<ArrayList<Customer>>().of(ExceptionEnum.CUSTOMER_NOT_FOUND_EXCEPTION.getMessage());
        }
        boolean isFind = false;
        String key = InputUtil.getInstance().inputString("Enter The Name to Search:");
        for (Customer customer : GlobalData.customerList) {
            if (customer.getName().contains(key) || customer.getPassword().contains(key)) {
                isFind = true;
                System.out.println(customer);
            }
        }
        return new GeneralResponse<ArrayList<Customer>>().of(StatusEnum.SEARCH_SUCCESSFULLY.getMessage());

    }

    @Override
    public Admin login() {
        System.out.println("-------------| ADMIN LOGIN |-------------");
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;
        while (attempts < MAX_ATTEMPTS) {
            String username = InputUtil.getInstance().inputString("Enter The username:");
            String password = InputUtil.getInstance().inputString("Enter the password:");
            for (int i = 0; i < admin.length; i++) {
                if (username.equalsIgnoreCase(admin[i].getUsername())) {
                    if (password.equalsIgnoreCase(admin[i].getPassword())){
                        System.out.println("Welcome - "+admin[i].getUsername());
                        setLogin(admin[i]);
                        return admin[i];
                    }

                }else {
                    System.out.println("Incorrect Login, Please try again!");
                    attempts++;
                }
            }
            if (attempts == MAX_ATTEMPTS){
                System.out.println("Maximum customerLogin attempts!" +
                         " System Closed");
                System.exit(-1);
            }
        }
        return null;
    }
}
