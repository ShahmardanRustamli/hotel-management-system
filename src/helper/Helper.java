package helper;

import model.Customer;
import model.Room;
import util.InputUtil;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Helper {
    public static Customer fillCustomer(){
        long id = 0;
        String name = InputUtil.getInstance().inputString("Enter The Name:");
        String surname = InputUtil.getInstance().inputString("Enter The Surname:");
        String phone = InputUtil.getInstance().inputString("Enter The Phone Number:");
        String email = InputUtil.getInstance().inputString("Enter The Email:");
        String password = InputUtil.getInstance().inputString("Enter The Password:");
        String moneyAcc = InputUtil.getInstance().inputString("Enter The Account:");
        LocalDateTime registerDate = LocalDateTime.now();
        LocalDateTime updateTime = LocalDateTime.now();
        LocalDateTime reservationDate = LocalDateTime.now();
        LocalDateTime endReservationDate = LocalDateTime.now();
        int roomId = 0;

        return new Customer(id+1,name,surname,phone,email,password,moneyAcc,registerDate,updateTime,reservationDate,endReservationDate,roomId);
    }
    public static Room fillRoom(){
        int roomId =1;
        System.out.println("_______________ENTER THE ROOM INFORMATION_______________");
        int roomNumber = InputUtil.getInstance().inputInt("Enter The Room size:");
        byte roomType = InputUtil.getInstance().inputByte("Enter The Room type:");
        int price = InputUtil.getInstance().inputInt("Enter The Room Price:");
        String situationStatus = "Available";
        return new Room(roomId+1,roomNumber,roomType,price,situationStatus);
    }
}
